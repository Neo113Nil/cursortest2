package net.oneformapp;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.view.PreviewView;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzak;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzam;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.tabs.TabLayout;
import com.google.common.base.Joiner;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.mlkit.vision.barcode.internal.zzm;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.widget.NonFocusableTabLayout;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.Views;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import dev.chrisbanes.haze.Pool;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutorKt;
import net.idrnd.misnap.iad.Payload;
import okhttp3.Cache;
import okhttp3.Cache$RealCacheRequest$1;
import okhttp3.internal._UtilCommonKt;
import okio.Sink;

/* loaded from: classes4.dex */
public final class PopEncryptorV2_ implements zzm, CameraXBinder {
    public static PopEncryptorV2_ instance_;
    public Object authStore;
    public Object cryptor;
    public Object encryptionKey;
    public Object hmacKey;
    public boolean isInit;

    public PopEncryptorV2_(Cache cache, Response response) {
        this.authStore = cache;
        this.encryptionKey = response;
        Sink newSink = response.newSink(1);
        this.hmacKey = newSink;
        this.cryptor = new Cache$RealCacheRequest$1(cache, this, newSink);
    }

    public static PopEncryptorV2_ getInstance_(Context context) {
        if (instance_ == null) {
            Context applicationContext = context.getApplicationContext();
            PopEncryptorV2_ popEncryptorV2_ = new PopEncryptorV2_();
            popEncryptorV2_.encryptionKey = null;
            popEncryptorV2_.hmacKey = null;
            popEncryptorV2_.cryptor = null;
            popEncryptorV2_.isInit = false;
            instance_ = popEncryptorV2_;
            Pool pool = new Pool();
            pool.pool = new Payload(applicationContext);
            popEncryptorV2_.authStore = pool;
        }
        return instance_;
    }

    public static void setRequestProperties(HttpURLConnection httpURLConnection, PopEncryptorV2_ popEncryptorV2_) {
        String str = (String) popEncryptorV2_.cryptor;
        httpURLConnection.setRequestProperty("UNLEASH-APPNAME", str);
        httpURLConnection.setRequestProperty("UNLEASH-INSTANCEID", (String) popEncryptorV2_.authStore);
        httpURLConnection.setRequestProperty("User-Agent", str);
        for (Map.Entry entry : ((HashMap) popEncryptorV2_.hmacKey).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public void abort() {
        synchronized (((Cache) this.authStore)) {
            if (this.isInit) {
                return;
            }
            this.isInit = true;
            _UtilCommonKt.closeQuietly((Sink) this.hmacKey);
            try {
                ((Response) this.encryptionKey).abort();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraXBinder
    public void bind() {
        ((CameraPreview) this.hmacKey).rebind((PreviewView) this.cryptor, CameraPreview.CameraDirection.BACK, (GovernmentIdFeed) this.authStore, this.isInit, ((Screen.CameraScreen) this.encryptionKey).onCameraError);
    }

    public Cache$RealCacheRequest$1 body() {
        return (Cache$RealCacheRequest$1) this.cryptor;
    }

    public void populateTabsFromPagerAdapter() {
        NonFocusableTabLayout nonFocusableTabLayout = (NonFocusableTabLayout) this.encryptionKey;
        nonFocusableTabLayout.removeAllTabs();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.authStore;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab newTab = nonFocusableTabLayout.newTab();
                NonFocusableTabLayout nonFocusableTabLayout2 = (NonFocusableTabLayout) ((MaterialButton$$ExternalSyntheticLambda3) this.cryptor).f$0;
                ColorPalette colorPalette = ThemeHelpersKt.themeInfo(nonFocusableTabLayout2).colorPalette;
                View view = new View(nonFocusableTabLayout2.getContext());
                Context context = view.getContext();
                context.getClass();
                int dip = Views.dip(context, 8);
                Context context2 = view.getContext();
                context2.getClass();
                view.setLayoutParams(new ViewGroup.LayoutParams(dip, Views.dip(context2, 8)));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{colorPalette.pageControlSelected, colorPalette.pageControlUnselected}));
                view.setBackground(gradientDrawable);
                if (view.isAttachedToWindow()) {
                    ViewParent parent = view.getParent();
                    parent.getClass();
                    ViewGroup viewGroup = (ViewGroup) parent;
                    Context context3 = view.getContext();
                    context3.getClass();
                    int dip2 = Views.dip(context3, 4);
                    Context context4 = view.getContext();
                    context4.getClass();
                    viewGroup.setPadding(dip2, viewGroup.getPaddingTop(), Views.dip(context4, 4), viewGroup.getPaddingBottom());
                } else {
                    view.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(9, view, view));
                }
                newTab.customView = view;
                newTab.updateView();
                nonFocusableTabLayout.addTab(newTab, false);
            }
            if (itemCount > 0) {
                int min = Math.min(((ViewPager2) this.hmacKey).mCurrentItem, nonFocusableTabLayout.tabs.size() - 1);
                if (min != nonFocusableTabLayout.getSelectedTabPosition()) {
                    nonFocusableTabLayout.selectTab(nonFocusableTabLayout.getTabAt(min), true);
                }
            }
        }
    }

    public void setType(FillrWidget.WidgetType widgetType) {
        if (widgetType != null) {
            this.cryptor = widgetType;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Widget Type cannot be null");
        }
    }

    public void setWidgetAuth(Joiner joiner) {
        if (joiner.isValid()) {
            this.authStore = joiner;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Widget auth invalid");
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public ArrayList zza(InputImage inputImage) {
        zzu[] zzuVarArr;
        if (((zzaj) this.authStore) == null) {
            zzc();
        }
        zzaj zzajVar = (zzaj) this.authStore;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzan zzanVar = new zzan(inputImage.zzd, inputImage.zze, 0, CommonConvertUtils.convertToMVRotation(inputImage.zzf), 0L);
        try {
            int i = inputImage.zzg;
            if (i == -1) {
                ObjectWrapper objectWrapper = new ObjectWrapper(inputImage.zza);
                Parcel zza = zzajVar.zza();
                int i2 = zzc.$r8$clinit;
                zza.writeStrongBinder(objectWrapper);
                zza.writeInt(1);
                zzanVar.writeToParcel(zza, 0);
                Parcel zzb = zzajVar.zzb(zza, 2);
                zzu[] zzuVarArr2 = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
                zzb.recycle();
                zzuVarArr = zzuVarArr2;
            } else if (i == 17) {
                zzuVarArr = zzajVar.zze(new ObjectWrapper(inputImage.zzb), zzanVar);
            } else if (i == 35) {
                Image.Plane[] planes = inputImage.getPlanes();
                zzae.checkNotNull(planes);
                zzanVar.zza = planes[0].getRowStride();
                zzuVarArr = zzajVar.zze(new ObjectWrapper(planes[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + inputImage.zzg, 3);
                }
                zzuVarArr = zzajVar.zze(new ObjectWrapper(KTypeSubstitutorKt.convertToNv21Buffer(inputImage)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArr) {
                arrayList.add(new Barcode(new SizeMap(zzuVar, 9)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to detect with legacy barcode detector");
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public void zzb() {
        zzaj zzajVar = (zzaj) this.authStore;
        if (zzajVar != null) {
            try {
                zzajVar.zzc(zzajVar.zza(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.authStore = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public boolean zzc() {
        zzam zzakVar;
        zzwp zzwpVar = (zzwp) this.cryptor;
        Context context = (Context) this.encryptionKey;
        if (((zzaj) this.authStore) != null) {
            return false;
        }
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
            int i = zzal.$r8$clinit;
            if (instantiate == null) {
                zzakVar = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                zzakVar = queryLocalInterface instanceof zzam ? (zzam) queryLocalInterface : new zzak(instantiate, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 7);
            }
            zzaj zzd = ((zzak) zzakVar).zzd(new ObjectWrapper(context), (zzah) this.hmacKey);
            this.authStore = zzd;
            if (zzd == null && !this.isInit) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                OptionalModuleUtils.requestDownload(context, "barcode");
                this.isInit = true;
                zzb.zze(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zzb.zze(zzwpVar, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy barcode detector.");
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }

    public PopEncryptorV2_(Context context, BarcodeScannerOptions barcodeScannerOptions, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.hmacKey = zzahVar;
        this.encryptionKey = context;
        zzahVar.zza = barcodeScannerOptions.zza;
        this.cryptor = zzwpVar;
    }
}
