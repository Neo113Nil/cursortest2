package com.crrepa.band.my.device.watchface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityDressWatchFaceBinding;
import com.crrepa.band.my.device.watchface.adapter.RecommendWatchFaceAdapter;
import com.crrepa.band.my.device.watchfacenew.photo.utils.CropBitmapTool;
import com.crrepa.band.my.model.WatchFaceSvgModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class DressWatchFaceActivity extends BaseVBActivity<ActivityDressWatchFaceBinding> implements x1.b, OnItemClickListener {
    private static final String AI_WATCH_FACE_BG_NAME = "ai_watch_face_bg.jpg";
    private static final String COLOR_BLACK = "#000000";
    private static final int DEFAULT_ANGLE = 180;
    private static final int DEFAULT_QUANTITY = 30;
    private static final String EXTRA_CROP_IMAGE_URI = "extra_crop_image_uri";
    private static final int KALEIDOSCOPE_CARD_WIDTH = 60;
    private static final int WATCH_FACE_CARD_WIDTH = 100;
    RecommendWatchFaceAdapter recommendWatchFaceAdapter;
    Bitmap sourceBitmap = null;
    Bitmap kaleidoscopeBitmap = null;
    com.crrepa.band.my.device.watchface.presenter.c kaleidoscopePresent = new com.crrepa.band.my.device.watchface.presenter.c();
    com.crrepa.band.my.device.watchface.presenter.e svgFillColorPresent = new com.crrepa.band.my.device.watchface.presenter.e();
    ArrayList<WatchFaceSvgModel> watchFaceSvgModels = new ArrayList<>();
    private final BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
    private final boolean circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
    private final boolean roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
    private float watchFaceRatio = 1.0f;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).ivAnima.cancelAnimation();
            ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rlAnima.setVisibility(8);
        }
    }

    class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i8, boolean z7) {
            if (i8 >= 1) {
                DressWatchFaceActivity.this.kaleidoscopePresent.drawKaleidoscope(((ActivityDressWatchFaceBinding) ((BaseVBActivity) r2).binding).seekAngle.getProgress(), i8, DressWatchFaceActivity.this.roundedRectangleScreen);
            } else {
                ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rivKaFace.setImageBitmap(DressWatchFaceActivity.this.sourceBitmap);
                DressWatchFaceActivity dressWatchFaceActivity = DressWatchFaceActivity.this;
                dressWatchFaceActivity.kaleidoscopeBitmap = dressWatchFaceActivity.sourceBitmap;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).seekQuantity.getProgress() < 1) {
                ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rivWatchFace.setImageBitmap(Bitmap.createBitmap(DressWatchFaceActivity.this.sourceBitmap));
            } else {
                ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rivWatchFace.setImageBitmap(Bitmap.createBitmap(DressWatchFaceActivity.this.kaleidoscopeBitmap));
            }
            for (int i8 = 0; i8 < DressWatchFaceActivity.this.watchFaceSvgModels.size(); i8++) {
                WatchFaceSvgModel watchFaceSvgModel = DressWatchFaceActivity.this.watchFaceSvgModels.get(i8);
                if (watchFaceSvgModel.isChecked()) {
                    watchFaceSvgModel.setChecked(false);
                    DressWatchFaceActivity.this.recommendWatchFaceAdapter.notifyItemChanged(i8);
                }
            }
        }
    }

    class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i8, boolean z7) {
            if (((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).seekQuantity.getProgress() >= 1) {
                DressWatchFaceActivity dressWatchFaceActivity = DressWatchFaceActivity.this;
                dressWatchFaceActivity.kaleidoscopePresent.drawKaleidoscope(i8, ((ActivityDressWatchFaceBinding) ((BaseVBActivity) dressWatchFaceActivity).binding).seekQuantity.getProgress(), DressWatchFaceActivity.this.roundedRectangleScreen);
            } else {
                ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rivKaFace.setImageBitmap(DressWatchFaceActivity.this.sourceBitmap);
                DressWatchFaceActivity dressWatchFaceActivity2 = DressWatchFaceActivity.this;
                dressWatchFaceActivity2.kaleidoscopeBitmap = dressWatchFaceActivity2.sourceBitmap;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).seekQuantity.getProgress() < 1) {
                ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rivWatchFace.setImageBitmap(Bitmap.createBitmap(DressWatchFaceActivity.this.sourceBitmap));
            } else {
                ((ActivityDressWatchFaceBinding) ((BaseVBActivity) DressWatchFaceActivity.this).binding).rivWatchFace.setImageBitmap(Bitmap.createBitmap(DressWatchFaceActivity.this.kaleidoscopeBitmap));
            }
            for (int i8 = 0; i8 < DressWatchFaceActivity.this.watchFaceSvgModels.size(); i8++) {
                WatchFaceSvgModel watchFaceSvgModel = DressWatchFaceActivity.this.watchFaceSvgModels.get(i8);
                if (watchFaceSvgModel.isChecked()) {
                    watchFaceSvgModel.setChecked(false);
                    DressWatchFaceActivity.this.recommendWatchFaceAdapter.notifyItemChanged(i8);
                }
            }
        }
    }

    private void getBitmapFromUri() {
        try {
            this.sourceBitmap = BitmapFactory.decodeFile(new File(new URI(getIntent().getStringExtra(EXTRA_CROP_IMAGE_URI))).getPath());
        } catch (URISyntaxException e8) {
            e8.printStackTrace();
        }
    }

    public static Intent getCallingIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) DressWatchFaceActivity.class);
        intent.putExtra(EXTRA_CROP_IMAGE_URI, str);
        return intent;
    }

    private String getColorInPalette(Palette.Swatch swatch) {
        float[] hsl = swatch.getHsl();
        if (hsl[0] > 0.2f) {
            float f8 = hsl[1];
            if (f8 < 0.4f) {
                hsl[1] = f8 + 0.4f;
            } else if (f8 < 0.7f) {
                hsl[1] = f8 + 0.3f;
            }
            hsl[2] = 0.5f;
        }
        return String.format("#%06X", Integer.valueOf(ColorUtils.HSLToColor(hsl) & ViewCompat.MEASURED_SIZE_MASK));
    }

    private void initKaleidoscopeStyle() {
        Bitmap bitmap = this.sourceBitmap;
        if (bitmap != null) {
            this.kaleidoscopePresent.setSourceImage(bitmap);
            this.kaleidoscopePresent.drawKaleidoscope(180.0f, 30, this.roundedRectangleScreen);
        }
    }

    private void initListener() {
        ((ActivityDressWatchFaceBinding) this.binding).seekQuantity.setOnSeekBarChangeListener(new b());
        ((ActivityDressWatchFaceBinding) this.binding).seekAngle.setOnSeekBarChangeListener(new c());
        ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setBorderWidth(R.dimen.watch_face_border_width);
        ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setBorderColor(0);
        ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setSecondBorderWidth(R.dimen.watch_face_box_width);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setOval(true);
        } else {
            ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setCornerRadius(this.connectBand.getRoundedRadius());
        }
        ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceActivity.this.lambda$initListener$6(view);
            }
        });
    }

    private void initRecommendWatchFaceAdapter() {
        this.recommendWatchFaceAdapter = new RecommendWatchFaceAdapter(this.watchFaceRatio);
        ((ActivityDressWatchFaceBinding) this.binding).rvRecommendWatchFace.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((ActivityDressWatchFaceBinding) this.binding).rvRecommendWatchFace.addItemDecoration(new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(this, 10.0f)));
        ((ActivityDressWatchFaceBinding) this.binding).rvRecommendWatchFace.setAdapter(this.recommendWatchFaceAdapter);
        this.recommendWatchFaceAdapter.setNewData(this.watchFaceSvgModels);
        this.recommendWatchFaceAdapter.setOnItemClickListener(this);
    }

    private void initSvgStyle() {
        if (this.sourceBitmap == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Palette.from(this.sourceBitmap).generate(new Palette.PaletteAsyncListener() { // from class: com.crrepa.band.my.device.watchface.j
            @Override // androidx.palette.graphics.Palette.PaletteAsyncListener
            public final void onGenerated(Palette palette) {
                DressWatchFaceActivity.this.lambda$initSvgStyle$5(arrayList, palette);
            }
        });
    }

    private void initWatchFaceLayoutParams() {
        if (this.circleScreen) {
            ((ActivityDressWatchFaceBinding) this.binding).cardWatchFace.setRadius(com.moyoung.dafit.module.common.utils.o.dp2px(this, 100.0f));
            ((ActivityDressWatchFaceBinding) this.binding).cardKaFace.setRadius(com.moyoung.dafit.module.common.utils.o.dp2px(this, 60.0f));
        } else if (this.roundedRectangleScreen) {
            ((ActivityDressWatchFaceBinding) this.binding).cardKaFace.setRadius(this.connectBand.getRoundedRadius());
            ((ActivityDressWatchFaceBinding) this.binding).cardWatchFace.setRadius(this.connectBand.getRoundedRadius());
        }
        WatchFace watchFace = new WatchFaceDaoProxy().getWatchFace(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (watchFace != null) {
            try {
                this.watchFaceRatio = watchFace.getWidth().intValue() / watchFace.getHeight().floatValue();
            } catch (NullPointerException e8) {
                e8.printStackTrace();
            }
        } else {
            this.watchFaceRatio = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth() / com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        }
        if (this.watchFaceRatio > 1.0f) {
            this.watchFaceRatio = 1.0f;
        }
        ((ActivityDressWatchFaceBinding) this.binding).cardWatchFace.post(new Runnable() { // from class: com.crrepa.band.my.device.watchface.k
            @Override // java.lang.Runnable
            public final void run() {
                DressWatchFaceActivity.this.lambda$initWatchFaceLayoutParams$3();
            }
        });
        ((ActivityDressWatchFaceBinding) this.binding).cardKaFace.post(new Runnable() { // from class: com.crrepa.band.my.device.watchface.l
            @Override // java.lang.Runnable
            public final void run() {
                DressWatchFaceActivity.this.lambda$initWatchFaceLayoutParams$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(View view) {
        if (((ActivityDressWatchFaceBinding) this.binding).seekQuantity.getProgress() < 1) {
            ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.setImageBitmap(Bitmap.createBitmap(this.sourceBitmap));
        } else {
            ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.setImageBitmap(Bitmap.createBitmap(this.kaleidoscopeBitmap));
        }
        for (int i8 = 0; i8 < this.watchFaceSvgModels.size(); i8++) {
            this.watchFaceSvgModels.get(i8).setChecked(false);
            this.recommendWatchFaceAdapter.notifyItemChanged(i8);
        }
        VB vb = this.binding;
        ((ActivityDressWatchFaceBinding) vb).rivKaFace.setSecondBorderColor(ContextCompat.getColor(((ActivityDressWatchFaceBinding) vb).rivKaFace.getContext(), R.color.color_watch_face_border_h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onConfirmClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSvgStyle$5(ArrayList arrayList, Palette palette) {
        if (palette != null) {
            if (palette.getLightMutedSwatch() != null) {
                arrayList.add(getColorInPalette(palette.getLightMutedSwatch()));
            }
            if (palette.getLightVibrantSwatch() != null) {
                arrayList.add(getColorInPalette(palette.getLightVibrantSwatch()));
            }
            if (palette.getVibrantSwatch() != null) {
                arrayList.add(getColorInPalette(palette.getVibrantSwatch()));
            }
            if (palette.getMutedSwatch() != null) {
                arrayList.add(getColorInPalette(palette.getMutedSwatch()));
            }
            if (palette.getDarkMutedSwatch() != null) {
                arrayList.add(getColorInPalette(palette.getDarkMutedSwatch()));
            }
            if (palette.getDarkVibrantSwatch() != null) {
                arrayList.add(getColorInPalette(palette.getDarkVibrantSwatch()));
            }
            List<Palette.Swatch> swatches = palette.getSwatches();
            for (int i8 = 0; i8 < swatches.size(); i8++) {
                String colorInPalette = getColorInPalette(swatches.get(i8));
                if (!arrayList.contains(colorInPalette)) {
                    arrayList.add(colorInPalette);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(COLOR_BLACK);
        }
        this.svgFillColorPresent.startParseXml(arrayList, com.moyoung.dafit.module.common.utils.r.getXmlResourcesId(this, R.array.svgXml));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWatchFaceLayoutParams$3() {
        int measuredHeight = (int) (((ActivityDressWatchFaceBinding) this.binding).cardWatchFace.getMeasuredHeight() * this.watchFaceRatio);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((ActivityDressWatchFaceBinding) this.binding).cardWatchFace.getLayoutParams();
        layoutParams.width = measuredHeight;
        ((ActivityDressWatchFaceBinding) this.binding).cardWatchFace.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWatchFaceLayoutParams$4() {
        int measuredHeight = (int) (((ActivityDressWatchFaceBinding) this.binding).cardKaFace.getMeasuredHeight() * this.watchFaceRatio);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityDressWatchFaceBinding) this.binding).cardKaFace.getLayoutParams();
        layoutParams.width = measuredHeight;
        ((ActivityDressWatchFaceBinding) this.binding).cardKaFace.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfirmClicked$7() {
        int intValue;
        int i8;
        ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.setDrawingCacheEnabled(true);
        Bitmap drawingCache = ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.getDrawingCache();
        if (drawingCache == null) {
            finish();
            return;
        }
        File file = new File(CropBitmapTool.getCropCacheFolder(), (System.currentTimeMillis() / 1000) + ".png");
        WatchFace watchFace = new WatchFaceDaoProxy().getWatchFace(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (watchFace == null) {
            i8 = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
            intValue = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        } else {
            int intValue2 = watchFace.getWidth().intValue();
            intValue = watchFace.getHeight().intValue();
            i8 = intValue2;
        }
        Bitmap cirleBitmap = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen() ? com.moyoung.dafit.module.common.utils.g.getCirleBitmap(com.moyoung.dafit.module.common.utils.g.changeBitmapSize(drawingCache, i8, intValue)) : i8 > drawingCache.getWidth() ? com.moyoung.dafit.module.common.utils.g.scaleAndCropBitmap(drawingCache, i8, intValue) : com.moyoung.dafit.module.common.utils.g.changeBitmapSize(drawingCache, i8, intValue);
        com.orhanobut.logger.f.d("bitmap width :" + cirleBitmap.getWidth() + " bitmap height :" + cirleBitmap.getHeight());
        StringBuilder sb = new StringBuilder();
        sb.append("filepath:");
        sb.append(file.getAbsolutePath());
        com.orhanobut.logger.f.d(sb.toString());
        com.moyoung.dafit.module.common.utils.g.saveBitmap(cirleBitmap, file);
        ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.setDrawingCacheEnabled(false);
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(file));
        intent.putExtra("file_path", file.getAbsolutePath());
        setResult(-1, intent);
        finish();
    }

    @SuppressLint({"CheckResult"})
    private void setupAnimation() {
        Observable.just(1).delay(new Random().nextInt(5) + 1, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.kaleidoscopePresent.setView(this);
        this.svgFillColorPresent.setView(this);
        setupAnimation();
        initListener();
        getBitmapFromUri();
        initKaleidoscopeStyle();
        initSvgStyle();
        initWatchFaceLayoutParams();
        initRecommendWatchFaceAdapter();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityDressWatchFaceBinding) this.binding).btnTakePhoto.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityDressWatchFaceBinding) this.binding).btnTakePhoto.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityDressWatchFaceBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceActivity.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    public void onConfirmClicked() {
        ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.post(new Runnable() { // from class: com.crrepa.band.my.device.watchface.n
            @Override // java.lang.Runnable
            public final void run() {
                DressWatchFaceActivity.this.lambda$onConfirmClicked$7();
            }
        });
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        for (int i9 = 0; i9 < this.watchFaceSvgModels.size(); i9++) {
            WatchFaceSvgModel watchFaceSvgModel = this.watchFaceSvgModels.get(i9);
            if (i8 == i9) {
                watchFaceSvgModel.setChecked(true);
                baseQuickAdapter.notifyItemChanged(i9);
                ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.setImageBitmap(w1.i.getSvgBitmap(watchFaceSvgModel));
            } else if (watchFaceSvgModel.isChecked()) {
                watchFaceSvgModel.setChecked(false);
                baseQuickAdapter.notifyItemChanged(i9);
            }
        }
        ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setSecondBorderColor(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "表盘_自定义_AI表盘_编辑");
    }

    @Override // x1.b
    public void renderKaleidoscopeStyle(Bitmap bitmap) {
        ((ActivityDressWatchFaceBinding) this.binding).rivKaFace.setImageBitmap(bitmap);
        this.kaleidoscopeBitmap = bitmap;
    }

    @Override // x1.b
    public void renderRecommendWatchFace(ArrayList<WatchFaceSvgModel> arrayList) {
        this.watchFaceSvgModels.clear();
        this.watchFaceSvgModels.addAll(arrayList);
        WatchFaceSvgModel watchFaceSvgModel = arrayList.get(0);
        watchFaceSvgModel.setChecked(true);
        this.recommendWatchFaceAdapter.notifyDataSetChanged();
        ((ActivityDressWatchFaceBinding) this.binding).rivWatchFace.setImageBitmap(w1.i.getSvgBitmap(watchFaceSvgModel));
    }
}
