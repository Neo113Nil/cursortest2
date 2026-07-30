package com.crrepa.band.my.health.ecg;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityEcgResultBinding;
import com.crrepa.band.my.health.ecg.share.b;
import com.crrepa.band.my.health.ecg.view.EcgView;
import com.crrepa.band.my.model.db.Ecg;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.widgets.DragImageView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;

/* loaded from: classes2.dex */
public class BandEcgResultActivity extends BaseActivity {
    private static final String MEASURE_DATA = "measure_data";
    private ActivityEcgResultBinding binding;
    private Ecg ecg;
    private MaterialDialog materialDialog;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(int[] iArr) {
            BandEcgResultActivity.this.showEcg(iArr);
            BandEcgResultActivity.this.showThumbnailEcg(iArr);
        }
    }

    class b implements Function {
        b() {
        }

        @Override // io.reactivex.functions.Function
        public int[] apply(String str) {
            return new n2.a().readEcgData(str);
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(File file) {
            BandEcgResultActivity.this.cancelShareDialog();
            BandEcgResultActivity.this.shareEcgFile(file);
        }
    }

    class d implements Function {
        d() {
        }

        @Override // io.reactivex.functions.Function
        public File apply(Ecg ecg) {
            return new o2.a(BandEcgResultActivity.this, ecg).buildPDF();
        }
    }

    class e implements DragImageView.a {
        e() {
        }

        @Override // com.moyoung.dafit.module.common.widgets.DragImageView.a
        public void onDragChange(int i8, int i9) {
            BandEcgResultActivity.this.setEcgviewSlideChange(i8);
        }
    }

    class f implements EcgView.a {
        f() {
        }

        @Override // com.crrepa.band.my.health.ecg.view.EcgView.a
        public void onSlideChange(int i8) {
            BandEcgResultActivity.this.setDrawSlideChange(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelShareDialog() {
        MaterialDialog materialDialog = this.materialDialog;
        if (materialDialog != null) {
            materialDialog.cancel();
        }
    }

    public static Intent getCallingIntent(Context context, Ecg ecg) {
        Intent intent = new Intent(context, (Class<?>) BandEcgResultActivity.class);
        intent.putExtra(MEASURE_DATA, ecg);
        return intent;
    }

    private Ecg getEcgMeasureData() {
        return (Ecg) getIntent().getParcelableExtra(MEASURE_DATA);
    }

    private void getMeasureEcgData() {
        String path = this.ecg.getPath();
        if (TextUtils.isEmpty(path)) {
            return;
        }
        Observable.just(path).map(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    private int getUvValue() {
        return com.crrepa.band.my.health.ecg.view.b.getPerGridUvValue(this.ecg.getPerGridUvValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        onShareClicked();
    }

    private void setActionBar(@ColorRes int i8) {
        this.binding.includeTitleBar.btnTitleBack.setBackgroundResource(R.drawable.ic_back_w);
        this.binding.includeTitleBar.btnTitleHistory.setBackgroundResource(R.drawable.selector_ecg_share);
        this.binding.includeTitleBar.btnTitleHistory.setVisibility(0);
        this.binding.includeTitleBar.titleBar.setBackgroundResource(i8);
    }

    private void setAverageHeartRate() {
        int intValue = this.ecg.getAverageHeartRate().intValue();
        this.binding.tvEcgAverageHeartRate.setText(getString(R.string.ecg_average_heart_rate) + (intValue <= 0 ? getString(R.string.data_blank) : String.valueOf(intValue)) + getString(R.string.heart_rate_unit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawSlideChange(int i8) {
        this.binding.ivDrag.setDragPosition(-this.binding.thumbnailEcgview.getLeftSlidePx(i8));
    }

    private void setEcgSlideChangeListener() {
        this.binding.ecgview.setSlideChangeListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgviewSlideChange(int i8) {
        this.binding.ecgview.setLeftEcgCount(this.binding.thumbnailEcgview.getLeftEcgCount(i8));
    }

    private void setThumbnailDragChangeListener() {
        this.binding.ivDrag.setDrawChangeListener(new e());
    }

    private void setTitle() {
        this.binding.includeTitleBar.tvTitle.setText(com.moyoung.dafit.module.common.utils.m.format(this.ecg.getDate(), com.crrepa.band.my.health.base.j.getSyncTimeFormat(this)));
        this.binding.includeTitleBar.tvTitle.setTextColor(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareEcgFile(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        Uri fileUri = com.crrepa.band.my.health.ecg.share.a.getFileUri(this, "application/pdf", file);
        com.orhanobut.logger.f.d("uri: " + fileUri);
        new b.C0202b(this).setContentType("application/pdf").setShareFileUri(fileUri).build().shareBySystem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEcg(int[] iArr) {
        int intValue = this.ecg.getPerGridNumber().intValue();
        this.binding.ecgview.setSupportTooch(true);
        this.binding.ecgview.setPerGridCount(intValue);
        this.binding.ecgview.setPerGridUvValue(getUvValue());
        this.binding.ecgview.setData(iArr);
    }

    private void showShareDialog() {
        MaterialDialog build = new MaterialDialog.e(this).progressIndeterminateStyle(true).progress(true, 100).cancelable(false).build();
        this.materialDialog = build;
        build.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showThumbnailEcg(int[] iArr) {
        this.binding.thumbnailEcgview.setSupportTooch(false);
        this.binding.thumbnailEcgview.setDrawGird(false);
        this.binding.thumbnailEcgview.setDrawAllData(true);
        this.binding.thumbnailEcgview.setPerGridUvValue(getUvValue());
        this.binding.thumbnailEcgview.setData(iArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_ecg);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityEcgResultBinding inflate = ActivityEcgResultBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        Ecg ecgMeasureData = getEcgMeasureData();
        this.ecg = ecgMeasureData;
        if (ecgMeasureData == null) {
            finish();
            return;
        }
        setActionBar(R.color.color_ecg);
        setTitle();
        setAverageHeartRate();
        getMeasureEcgData();
        setThumbnailDragChangeListener();
        setEcgSlideChangeListener();
        this.binding.includeTitleBar.btnTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgResultActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.includeTitleBar.btnTitleHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgResultActivity.this.lambda$onCreate$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        MaterialDialog materialDialog = this.materialDialog;
        if (materialDialog != null) {
            materialDialog.cancel();
        }
    }

    public void onShareClicked() {
        showShareDialog();
        Observable.just(this.ecg).map(new d()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        int leftSlidePx = this.binding.thumbnailEcgview.getLeftSlidePx(this.binding.ecgview.getScreenDisplayCount());
        com.orhanobut.logger.f.d("onWindowFocusChanged: " + leftSlidePx);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.binding.ivDrag.getLayoutParams();
        layoutParams.width = leftSlidePx;
        this.binding.ivDrag.setLayoutParams(layoutParams);
    }
}
