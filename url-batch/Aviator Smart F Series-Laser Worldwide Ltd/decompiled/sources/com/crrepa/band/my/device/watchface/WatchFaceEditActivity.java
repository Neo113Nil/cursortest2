package com.crrepa.band.my.device.watchface;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityWatchFaceEditBinding;
import com.crrepa.band.my.device.watchface.adapter.PresetWatchFaceAdapter;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.PresetWatchFaceModel;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.yalantis.ucrop.UCrop;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/* loaded from: classes2.dex */
public class WatchFaceEditActivity extends BaseRequestPermissionActivity<ActivityWatchFaceEditBinding> implements x1.c, OnItemClickListener, OnItemChildClickListener {
    private static final int DEFAULT_WATCH_FACE_INDEX = 0;
    public static final int REQUEST_AI_WATCH_FACE = 102;
    private static final int REQUEST_GALLERY = 101;
    private static final String WATCH_FACE_INDEX = "watch_face_index";
    private q7.a permissionRequest;
    private MaterialDialog transDialog;
    private final String VIEW_INVALIDATE_TAG = "INVALIDATE";
    private final com.crrepa.band.my.device.watchface.presenter.f presenter = new com.crrepa.band.my.device.watchface.presenter.f();
    private final PresetWatchFaceAdapter watchFaceAdapter = new PresetWatchFaceAdapter();
    private boolean isDateLabelInitialized = false;

    class a implements RadioGroup.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i8) {
            int i9;
            switch (i8) {
                case R.id.rb_watch_face_text_color_black /* 2131363323 */:
                    i9 = 1;
                    break;
                case R.id.rb_watch_face_text_color_blue /* 2131363324 */:
                    i9 = 6;
                    break;
                case R.id.rb_watch_face_text_color_green /* 2131363325 */:
                    i9 = 8;
                    break;
                case R.id.rb_watch_face_text_color_indigo /* 2131363326 */:
                    i9 = 7;
                    break;
                case R.id.rb_watch_face_text_color_origin /* 2131363327 */:
                    i9 = 3;
                    break;
                case R.id.rb_watch_face_text_color_purple /* 2131363328 */:
                    i9 = 5;
                    break;
                case R.id.rb_watch_face_text_color_red /* 2131363329 */:
                    i9 = 4;
                    break;
                case R.id.rb_watch_face_text_color_white /* 2131363330 */:
                default:
                    i9 = 0;
                    break;
                case R.id.rb_watch_face_text_color_yellow /* 2131363331 */:
                    i9 = 2;
                    break;
            }
            WatchFaceEditActivity.this.presenter.saveWatchFaceTextColor(i9);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ActivityWatchFaceEditBinding) ((BaseVBActivity) WatchFaceEditActivity.this).binding).ivWatchFacePreview.setOval(true);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
                ((ActivityWatchFaceEditBinding) ((BaseVBActivity) WatchFaceEditActivity.this).binding).ivWatchFacePreview.setCornerRadius(r0.getRoundedRadius());
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ float val$ratio;

        d(float f8) {
            this.val$ratio = f8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredHeight = ((ActivityWatchFaceEditBinding) ((BaseVBActivity) WatchFaceEditActivity.this).binding).ivWatchFacePreview.getMeasuredHeight();
            float f8 = this.val$ratio;
            int dp2px = ((measuredHeight - ((int) (measuredHeight * f8))) / 2) + com.moyoung.dafit.module.common.utils.o.dp2px(WatchFaceEditActivity.this, f8 * 18.0f);
            com.orhanobut.logger.f.d("ivCircleWatchFaceBg end: " + dp2px);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityWatchFaceEditBinding) ((BaseVBActivity) WatchFaceEditActivity.this).binding).llWatchFaceContent.getLayoutParams();
            layoutParams.setMarginEnd(dp2px);
            ((ActivityWatchFaceEditBinding) ((BaseVBActivity) WatchFaceEditActivity.this).binding).llWatchFaceContent.setLayoutParams(layoutParams);
        }
    }

    class e implements MaterialDialog.l {
        e() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
        }
    }

    class f implements MaterialDialog.l {
        f() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            ((ActivityWatchFaceEditBinding) ((BaseVBActivity) WatchFaceEditActivity.this).binding).tvEditWatchFaceSave.performClick();
        }
    }

    class g implements PermissionDescriptionDialog.b {
        g() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("存储权限", true);
            x0.updateBandConfigWithPermissionCheck(WatchFaceEditActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("存储权限", false);
        }
    }

    private void cancelDialog() {
        MaterialDialog materialDialog = this.transDialog;
        if (materialDialog == null || materialDialog.isCancelled()) {
            return;
        }
        this.transDialog.cancel();
    }

    public static Intent getCallingIntent(Context context, int i8) {
        Intent intent = new Intent();
        intent.setClass(context, WatchFaceEditActivity.class);
        intent.putExtra(WATCH_FACE_INDEX, i8);
        return intent;
    }

    private Bitmap getWatchFacePreview() {
        ((ActivityWatchFaceEditBinding) this.binding).rlWatchFacePreview.setDrawingCacheEnabled(true);
        Bitmap copyBitmap = com.moyoung.dafit.module.common.utils.g.copyBitmap(((ActivityWatchFaceEditBinding) this.binding).rlWatchFacePreview.getDrawingCache());
        ((ActivityWatchFaceEditBinding) this.binding).rlWatchFacePreview.destroyDrawingCache();
        int measuredHeight = ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.getMeasuredHeight();
        int measuredWidth = ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.getMeasuredWidth();
        com.orhanobut.logger.f.d("measuredHeight: " + measuredHeight);
        com.orhanobut.logger.f.d("measuredWidth: " + measuredWidth);
        return com.moyoung.dafit.module.common.utils.g.cropBitmap(copyBitmap, measuredWidth, measuredHeight);
    }

    private void initPresetList() {
        ((ActivityWatchFaceEditBinding) this.binding).rcvPresetList.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((ActivityWatchFaceEditBinding) this.binding).rcvPresetList.addItemDecoration(new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(this, 10.0f)));
        ((ActivityWatchFaceEditBinding) this.binding).rcvPresetList.setAdapter(this.watchFaceAdapter);
        this.watchFaceAdapter.setOnItemClickListener(this);
        this.watchFaceAdapter.setOnItemChildClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        List<PresetWatchFaceModel> data = this.watchFaceAdapter.getData();
        for (int i8 = 0; i8 < data.size(); i8++) {
            PresetWatchFaceModel presetWatchFaceModel = data.get(i8);
            if (presetWatchFaceModel.isChecked()) {
                this.presenter.saveWatchFace(this, presetWatchFaceModel, i8, getWatchFacePreview());
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initOnClickListener$2(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        this.presenter.saveWatchFaceTimePosition(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$3(View view) {
        new MaterialDialog.e(this).title(R.string.watch_face_time_position).items(R.array.watch_face_position_array).itemsCallbackSingleChoice(this.presenter.getWatchFaceTimePosition(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.watchface.w0
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initOnClickListener$2;
                lambda$initOnClickListener$2 = WatchFaceEditActivity.this.lambda$initOnClickListener$2(materialDialog, view2, i8, charSequence);
                return lambda$initOnClickListener$2;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initOnClickListener$4(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        this.presenter.saveWatchFaceTimeTopContent(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$5(View view) {
        new MaterialDialog.e(this).title(R.string.watch_face_time_position_top_content).items(R.array.watch_face_content_array).itemsCallbackSingleChoice(this.presenter.getWatchFaceTimeTopContent(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.watchface.n0
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initOnClickListener$4;
                lambda$initOnClickListener$4 = WatchFaceEditActivity.this.lambda$initOnClickListener$4(materialDialog, view2, i8, charSequence);
                return lambda$initOnClickListener$4;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initOnClickListener$6(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        this.presenter.saveWatchFaceTimeBottomContent(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$7(View view) {
        new MaterialDialog.e(this).title(R.string.watch_face_time_position_bottom_content).items(R.array.watch_face_content_array).itemsCallbackSingleChoice(this.presenter.getWatchFaceTimeBottomContent(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.watchface.t0
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initOnClickListener$6;
                lambda$initOnClickListener$6 = WatchFaceEditActivity.this.lambda$initOnClickListener$6(materialDialog, view2, i8, charSequence);
                return lambda$initOnClickListener$6;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderWatchFaceRatio$8(float f8) {
        if (((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.getTag() == null || !((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.getTag().equals("INVALIDATE")) {
            int measuredWidth = ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.getMeasuredWidth();
            int measuredHeight = ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.getMeasuredHeight();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.getLayoutParams();
            layoutParams.width = (int) (measuredWidth * f8);
            layoutParams.height = (int) (measuredHeight * f8);
            ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.setLayoutParams(layoutParams);
            if (f8 != 1.0f) {
                ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.setTag("INVALIDATE");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderWatchFaceRatio$9(float f8) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.getLayoutParams();
        layoutParams.width = (int) (((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.getMeasuredHeight() * f8);
        ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWatchFaceContent$10(ImageView imageView, float f8, int i8) {
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = (int) (measuredWidth * f8);
        layoutParams.height = (int) (measuredHeight * f8);
        imageView.setLayoutParams(layoutParams);
        this.isDateLabelInitialized = true;
        renderLabelView(i8, imageView);
    }

    private void renderLabelView(int i8, ImageView imageView) {
        int watchFaceContentResources = w1.j.getWatchFaceContentResources(i8);
        if (watchFaceContentResources < 0) {
            imageView.setVisibility(4);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(watchFaceContentResources);
        setWatchFaceContentTextColor(w1.j.getWatchFaceTextColorInt(this.presenter.getWatchFaceTextColorIndex()), imageView);
    }

    private void setTextColorChooceListener() {
        ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.setOnCheckedChangeListener(new a());
    }

    private void setWatchFaceContent(final int i8, TextView textView, final ImageView imageView, final float f8) {
        textView.setText(w1.j.getWatchFaceTimeContent(this, i8));
        if (this.isDateLabelInitialized) {
            renderLabelView(i8, imageView);
        } else {
            imageView.setImageResource(w1.j.getWatchFaceDateResources());
            imageView.post(new Runnable() { // from class: com.crrepa.band.my.device.watchface.s0
                @Override // java.lang.Runnable
                public final void run() {
                    WatchFaceEditActivity.this.lambda$setWatchFaceContent$10(imageView, f8, i8);
                }
            });
        }
    }

    private void setWatchFaceContentTextColor(@ColorInt int i8, ImageView imageView) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable).mutate(), i8);
    }

    private void setWatchFaceTextColorCheckIndex(int i8) {
        switch (i8) {
            case 0:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_white);
                break;
            case 1:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_black);
                break;
            case 2:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_yellow);
                break;
            case 3:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_origin);
                break;
            case 4:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_red);
                break;
            case 5:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_purple);
                break;
            case 6:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_blue);
                break;
            case 7:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_indigo);
                break;
            case 8:
                ((ActivityWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_green);
                break;
        }
    }

    private void showPermissionRationDialog(q7.a aVar) {
        if (q7.b.hasSelfPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        showRationaleDialog(R.string.permission_storage_rationale, R.string.allow, R.string.deny, aVar);
    }

    private void showStorePermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_storage).setTitle(R.string.permission_external_storage_title).setContent(getString(R.string.permission_watch_face_storage_content, getString(R.string.app_name))).setOnClickListener(new g()).build(this).show();
    }

    private void showTimeoutDialog() {
        new MaterialDialog.e(this).title(R.string.watch_face_timeout).content(R.string.watch_face_timeout_hint).positiveText(R.string.retry).negativeText(R.string.abort).onPositive(new f()).onNegative(new e()).show();
    }

    private void startGallery() {
        startActivityForResult(Intent.createChooser(w1.g.selectImageIntent(), getString(R.string.select_picture)), 101);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        setTextColorChooceListener();
        initPresetList();
        this.presenter.getWatchFaceLayout(getIntent().getIntExtra(WATCH_FACE_INDEX, 0));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityWatchFaceEditBinding) this.binding).tvEditWatchFaceCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceEditActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityWatchFaceEditBinding) this.binding).tvEditWatchFaceSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceEditActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityWatchFaceEditBinding) this.binding).rlWatchFaceTimePosition.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceEditActivity.this.lambda$initOnClickListener$3(view);
            }
        });
        ((ActivityWatchFaceEditBinding) this.binding).rlWatchFaceTimePositionTopContent.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceEditActivity.this.lambda$initOnClickListener$5(view);
            }
        });
        ((ActivityWatchFaceEditBinding) this.binding).rlWatchFaceTimePositionBottomContent.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceEditActivity.this.lambda$initOnClickListener$7(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        Uri data;
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1) {
            if (i9 == 96) {
                this.presenter.handleCropError(intent);
                return;
            }
            return;
        }
        if (i8 == 101) {
            Uri data2 = intent.getData();
            if (data2 != null) {
                this.presenter.startCrop(this, data2);
                return;
            } else {
                com.moyoung.dafit.module.common.utils.r0.showShort(this, getString(R.string.cannot_retrieve_selected_image));
                return;
            }
        }
        if (i8 == 69) {
            this.presenter.getCropResult(intent);
            return;
        }
        if (i8 != 102 || (data = intent.getData()) == null) {
            return;
        }
        try {
            renderWatchFaceBackground(BitmapFactory.decodeFile(new File(new URI(data.toString())).getPath()), 4);
        } catch (URISyntaxException e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        cancelDialog();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        PresetWatchFaceModel presetWatchFaceModel = (PresetWatchFaceModel) baseQuickAdapter.getData().get(i8);
        if (presetWatchFaceModel.getType() == 3) {
            requestPermission();
        } else if (presetWatchFaceModel.getType() == 4) {
            startActivityForResult(DressWatchFaceCameraActivity.getCallingIntent(this), 102);
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        PresetWatchFaceModel presetWatchFaceModel = (PresetWatchFaceModel) baseQuickAdapter.getData().get(i8);
        if (presetWatchFaceModel.isChecked() || !presetWatchFaceModel.hasWatchFace()) {
            return;
        }
        Bitmap bitmap = presetWatchFaceModel.getBitmap();
        if (bitmap != null) {
            ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.setImageBitmap(bitmap);
        } else {
            presetWatchFaceModel.getRequestCreator().centerCrop().into(((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview);
        }
        List<PresetWatchFaceModel> data = this.watchFaceAdapter.getData();
        if (data == null || data.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < data.size(); i9++) {
            PresetWatchFaceModel presetWatchFaceModel2 = data.get(i9);
            if (i8 == i9) {
                presetWatchFaceModel2.setChecked(true);
                baseQuickAdapter.notifyItemChanged(i9, 1);
            } else if (presetWatchFaceModel2.isChecked()) {
                presetWatchFaceModel2.setChecked(false);
                baseQuickAdapter.notifyItemChanged(i9, 1);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        x0.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "表盘_自定义");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // x1.c
    public void renderCropError(String str) {
        cancelDialog();
        com.moyoung.dafit.module.common.utils.r0.showShort(this, str);
    }

    @Override // x1.c
    public void renderCropView(UCrop uCrop) {
        startActivityForResult(uCrop.getIntent(this), 69);
    }

    @Override // x1.c
    public void renderDisconnectHint() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.band_setting_send_fail));
    }

    @Override // x1.c
    public void renderLowBatteryHint() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.measure_low_battery_hint));
    }

    @Override // x1.c
    public void renderPresetWatchFace(List<PresetWatchFaceModel> list) {
        this.watchFaceAdapter.setNewData(list);
    }

    @Override // x1.c
    public void renderRoundedRectangleScreen() {
        ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new c());
    }

    @Override // x1.c
    public void renderTransCompleted() {
        setResult(-1);
        finish();
    }

    @Override // x1.c
    public void renderTransError() {
        cancelDialog();
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.watch_face_picture_trans_error_msg));
        onBackPressedSupport();
    }

    @Override // x1.c
    public void renderTransProgressChanged(int i8) {
        MaterialDialog materialDialog = this.transDialog;
        if (materialDialog == null || materialDialog.isCancelled()) {
            return;
        }
        this.transDialog.incrementProgress(i8 - this.transDialog.getCurrentProgress());
    }

    @Override // x1.c
    public void renderTransProgressStarting() {
        this.transDialog = new MaterialDialog.e(this).title(R.string.watch_face_trans_dialog_title).progress(false, 100, false).cancelable(false).progressIndeterminateStyle(true).show();
    }

    @Override // x1.c
    public void renderTransTimeout() {
        cancelDialog();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isRealtek()) {
            return;
        }
        showTimeoutDialog();
    }

    @Override // x1.c
    public void renderWatchFaceBackground(Bitmap bitmap, int i8) {
        ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.setImageBitmap(bitmap);
        List<PresetWatchFaceModel> data = this.watchFaceAdapter.getData();
        if (data.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < data.size(); i9++) {
            PresetWatchFaceModel presetWatchFaceModel = data.get(i9);
            if (presetWatchFaceModel.getType() == i8) {
                presetWatchFaceModel.setChecked(true);
                presetWatchFaceModel.setBitmap(bitmap);
                presetWatchFaceModel.setHasWatchFace(true);
                this.watchFaceAdapter.notifyItemChanged(i9, 1);
            } else if (presetWatchFaceModel.isChecked()) {
                presetWatchFaceModel.setChecked(false);
                this.watchFaceAdapter.notifyItemChanged(i9, 1);
            }
        }
    }

    @Override // x1.c
    public void renderWatchFaceRatio(final float f8) {
        com.orhanobut.logger.f.d("renderWatchFaceRatio: " + f8);
        ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime.post(new Runnable() { // from class: com.crrepa.band.my.device.watchface.u0
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceEditActivity.this.lambda$renderWatchFaceRatio$8(f8);
            }
        });
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.setOval(true);
        } else {
            ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.setOval(false);
            ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchface.v0
                @Override // java.lang.Runnable
                public final void run() {
                    WatchFaceEditActivity.this.lambda$renderWatchFaceRatio$9(f8);
                }
            });
        }
    }

    @Override // x1.c
    public void renderWatchFaceTextColor(int i8) {
        setWatchFaceTextColorCheckIndex(i8);
        int watchFaceTextColorInt = w1.j.getWatchFaceTextColorInt(i8);
        setWatchFaceContentTextColor(watchFaceTextColorInt, ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTimeTop);
        setWatchFaceContentTextColor(watchFaceTextColorInt, ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTime);
        setWatchFaceContentTextColor(watchFaceTextColorInt, ((ActivityWatchFaceEditBinding) this.binding).ivWatchFaceTimeBottom);
    }

    @Override // x1.c
    public void renderWatchFaceTimeBottomContent(int i8, float f8) {
        VB vb = this.binding;
        setWatchFaceContent(i8, ((ActivityWatchFaceEditBinding) vb).tvWatchFaceTimePositionBottom, ((ActivityWatchFaceEditBinding) vb).ivWatchFaceTimeBottom, f8);
    }

    @Override // x1.c
    public void renderWatchFaceTimePosition(int i8, boolean z7, boolean z8, float f8) {
        ((ActivityWatchFaceEditBinding) this.binding).tvWatchFaceTimePosition.setText(w1.j.getWatchFaceTimePosition(this, i8));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityWatchFaceEditBinding) this.binding).llWatchFaceContent.getLayoutParams();
        if (i8 == 0) {
            layoutParams.removeRule(12);
            layoutParams.addRule(10);
        } else {
            layoutParams.removeRule(10);
            layoutParams.addRule(12);
        }
        if (z7) {
            layoutParams.addRule(14, 1);
            ((ActivityWatchFaceEditBinding) this.binding).llWatchFaceContent.setGravity(17);
        } else {
            layoutParams.addRule(21);
            ((ActivityWatchFaceEditBinding) this.binding).llWatchFaceContent.setGravity(GravityCompat.END);
            com.orhanobut.logger.f.d("ivCircleWatchFaceBg setGravity: 8388613");
            ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new d(f8));
            if (z8) {
                layoutParams.setMarginEnd(com.moyoung.dafit.module.common.utils.o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), 24.0f));
            }
        }
        ((ActivityWatchFaceEditBinding) this.binding).llWatchFaceContent.setLayoutParams(layoutParams);
    }

    @Override // x1.c
    public void renderWatchFaceTimeTopContent(int i8, float f8) {
        VB vb = this.binding;
        setWatchFaceContent(i8, ((ActivityWatchFaceEditBinding) vb).tvWatchFaceTimePositionTop, ((ActivityWatchFaceEditBinding) vb).ivWatchFaceTimeTop, f8);
    }

    @Override // x1.c
    public void rendercCircleScreen() {
        ((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new b());
    }

    public void requestPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            startGallery();
        } else if (q7.b.hasSelfPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            updateBandConfig();
        } else {
            showStorePermissionDialog();
        }
    }

    void showDeniedForStorage() {
        com.orhanobut.logger.f.d("showDeniedForStorage");
        com.crrepa.band.my.home.guidance.c.systemPermission("存储权限", false);
        q7.a aVar = this.permissionRequest;
        if (aVar == null) {
            return;
        }
        showPermissionRationDialog(aVar);
        this.requestDenied = true;
    }

    void showNeverAskForStorage() {
        if (q7.b.hasSelfPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        com.moyoung.dafit.module.common.utils.c0.jumpAppDetailsSetting(this);
    }

    void showRationaleForStorage(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForStorage");
        if (aVar == null) {
            return;
        }
        this.permissionRequest = aVar;
        if (this.requestDenied) {
            showPermissionRationDialog(aVar);
        } else {
            aVar.proceed();
        }
    }

    void updateBandConfig() {
        com.crrepa.band.my.home.guidance.c.systemPermission("存储权限", true);
        startGallery();
    }

    @Override // x1.c
    public void renderWatchFaceBackground(com.squareup.picasso.v vVar) {
        vVar.into(((ActivityWatchFaceEditBinding) this.binding).ivWatchFacePreview);
    }
}
