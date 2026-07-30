package com.crrepa.band.my.device.watchfacenew.photo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityNewCustomWatchFaceBinding;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class NewCustomWatchFaceActivity extends BaseVBActivity<ActivityNewCustomWatchFaceBinding> {
    public static final int REQUEST_AI_WATCH_FACE = 102;
    public static final String WATCH_FACE_PREVIEW_URL = "new_custom_watch_face_preview_url";
    private NewCustomWatchFaceFragment dressFragment;

    public static Intent getCallingIntent(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, NewCustomWatchFaceActivity.class);
        intent.putExtra(WATCH_FACE_PREVIEW_URL, str);
        return intent;
    }

    private void initViewPager() {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        String stringExtra = getIntent().getStringExtra(WATCH_FACE_PREVIEW_URL);
        arrayList.add(new NewCustomWatchFaceFragment(stringExtra, true));
        NewCustomWatchFaceFragment newCustomWatchFaceFragment = new NewCustomWatchFaceFragment(stringExtra, false);
        this.dressFragment = newCustomWatchFaceFragment;
        arrayList.add(newCustomWatchFaceFragment);
        contentPagerAdapter.setContentFragments(arrayList);
        ((ActivityNewCustomWatchFaceBinding) this.binding).vpClass.setAdapter(contentPagerAdapter);
        setVpCurrentItem();
        ((ActivityNewCustomWatchFaceBinding) this.binding).tab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityNewCustomWatchFaceBinding) vb).tab.setupWithViewPager(((ActivityNewCustomWatchFaceBinding) vb).vpClass);
        int[] iArr = {R.string.device_photo_watch_face_title, R.string.device_style_watch_face_title};
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            TabLayout.Tab tabAt = ((ActivityNewCustomWatchFaceBinding) this.binding).tab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setText(iArr[i8]);
            }
            Objects.requireNonNull(tabAt);
            o0.hideTabToast(tabAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResult$0(String str) {
        this.dressFragment.renderDressAddedImgList(str);
        Log.d("穿搭表盘", "Path: " + str);
    }

    private void setVpCurrentItem() {
        if (com.crrepa.band.my.device.watchfacenew.delegate.img.m.getSentToBandIsGallery()) {
            ((ActivityNewCustomWatchFaceBinding) this.binding).vpClass.setCurrentItem(0);
        } else {
            ((ActivityNewCustomWatchFaceBinding) this.binding).vpClass.setCurrentItem(1);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        i4.getInstance().queryPhotoWatchFaceAvailableSize();
        ((ActivityNewCustomWatchFaceBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCustomWatchFaceActivity.this.lambda$initBinding$1(view);
            }
        });
        initViewPager();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1) {
            return;
        }
        final String stringExtra = intent.getStringExtra("file_path");
        Log.d("穿搭表盘", "file_path: " + stringExtra);
        if (x0.isEmpty(stringExtra) || this.dressFragment == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.photo.i
            @Override // java.lang.Runnable
            public final void run() {
                NewCustomWatchFaceActivity.this.lambda$onActivityResult$0(stringExtra);
            }
        });
    }
}
