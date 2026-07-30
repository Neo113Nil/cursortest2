package S0;

import B1.C;
import B2.RunnableC0272f;
import D.y;
import O.A0;
import O.C0343e0;
import O.InterfaceC0358u;
import O.J;
import O.X;
import android.content.Context;
import android.content.Intent;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.emoji2.text.x;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase_Impl;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.api.ATNativeMaterial;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.api.NativeAd;
import com.google.android.gms.internal.ads.C3183f5;
import com.google.android.gms.internal.ads.InterfaceC3128e5;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.GzopArcadegamesActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import g1.C4523c;
import h.LayoutInflaterFactory2C4535B;
import h.t;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import k.AbstractC4614b;
import k.InterfaceC4613a;
import k4.C4648c;
import k4.InterfaceC4657l;
import pl.droidsonroids.gif.GifImageView;
import r7.AbstractC4979j;
import s1.InterfaceC4992e;
import u1.C5100A;
import u1.C5104d;
import w1.C5152e;
import y1.C5243r;

/* loaded from: classes.dex */
public final class l implements InterfaceC0358u, androidx.emoji2.text.o, InterfaceC4657l, InterfaceC4613a, ATNativeNetworkListener, InterfaceC3128e5, com.bumptech.glide.load.data.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2909n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2910u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2911v;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f2909n = i;
        this.f2910u = obj;
        this.f2911v = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l h(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e6) {
                e = e6;
                fileLock = null;
            }
            try {
                return new l(7, fileChannel, fileLock);
            } catch (IOException e9) {
                e = e9;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (IOException unused) {
                    }
                }
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (Error e10) {
                e = e10;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            } catch (OverlappingFileLockException e11) {
                e = e11;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            }
        } catch (IOException | Error | OverlappingFileLockException e12) {
            e = e12;
            fileChannel = null;
            fileLock = null;
        }
    }

    public static C m(ImageDecoder.Source source, int i, int i4, s1.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new A1.d(i, i4, hVar));
        if (A1.a.w(decodeDrawable)) {
            return new C(2, A1.a.h(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public static int o(int i, int i4) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i9++;
            if (i9 == i4) {
                i10++;
                i9 = 0;
            } else if (i9 > i4) {
                i10++;
                i9 = 1;
            }
        }
        return i9 + 1 > i4 ? i10 + 1 : i10;
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        switch (this.f2909n) {
            case 10:
                ((GzopArcadegamesActivity) this.f2911v).startActivity((Intent) this.f2910u);
                break;
            case 11:
                ((MainActivity) this.f2911v).startActivity((Intent) this.f2910u);
                break;
            default:
                ((j4.c) this.f2911v).f38560c.startActivity((Intent) this.f2910u);
                break;
        }
    }

    @Override // k.InterfaceC4613a
    public boolean a(AbstractC4614b abstractC4614b, MenuItem menuItem) {
        return ((InterfaceC4613a) this.f2910u).a(abstractC4614b, menuItem);
    }

    @Override // k.InterfaceC4613a
    public boolean b(AbstractC4614b abstractC4614b, l.l lVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C4535B) this.f2911v).f37998T;
        WeakHashMap weakHashMap = X.f2240a;
        J.c(viewGroup);
        return ((InterfaceC4613a) this.f2910u).b(abstractC4614b, lVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128e5
    public void c(C3183f5 c3183f5) {
        String obj = c3183f5.toString();
        String str = (String) this.f2910u;
        String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length()), "Failed to load URL: ", str, "\n", obj);
        int i = t2.C.f40822b;
        u2.i.f(q6);
        ((t2.q) this.f2911v).a(null);
    }

    @Override // com.bumptech.glide.load.data.c
    public void d(Exception exc) {
        C5100A c5100a = (C5100A) this.f2911v;
        C5243r c5243r = (C5243r) this.f2910u;
        C5243r c5243r2 = c5100a.f41057y;
        if (c5243r2 == null || c5243r2 != c5243r) {
            return;
        }
        C5100A c5100a2 = (C5100A) this.f2911v;
        C5243r c5243r3 = (C5243r) this.f2910u;
        u1.h hVar = c5100a2.f41053u;
        C5104d c5104d = c5100a2.f41058z;
        com.bumptech.glide.load.data.d dVar = c5243r3.f41859c;
        hVar.c(c5104d, exc, dVar, dVar.c());
    }

    @Override // k.InterfaceC4613a
    public boolean e(AbstractC4614b abstractC4614b, l.l lVar) {
        return ((InterfaceC4613a) this.f2910u).e(abstractC4614b, lVar);
    }

    public boolean equals(Object obj) {
        switch (this.f2909n) {
            case 9:
                if (!(obj instanceof N.b)) {
                    return false;
                }
                ((N.b) obj).getClass();
                return ((String) this.f2910u) == null && ((String) this.f2911v) == null;
            default:
                return super.equals(obj);
        }
    }

    @Override // androidx.emoji2.text.o
    public boolean f(CharSequence charSequence, int i, int i4, u uVar) {
        if ((uVar.f4918c & 4) > 0) {
            return true;
        }
        if (((x) this.f2910u) == null) {
            this.f2910u = new x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((W3.e) this.f2911v).getClass();
        ((x) this.f2910u).setSpan(new v(uVar), i, i4, 33);
        return true;
    }

    @Override // com.bumptech.glide.load.data.c
    public void g(Object obj) {
        C5100A c5100a = (C5100A) this.f2911v;
        C5243r c5243r = (C5243r) this.f2910u;
        C5243r c5243r2 = c5100a.f41057y;
        if (c5243r2 == null || c5243r2 != c5243r) {
            return;
        }
        C5100A c5100a2 = (C5100A) this.f2911v;
        C5243r c5243r3 = (C5243r) this.f2910u;
        u1.j jVar = c5100a2.f41052n.f41087p;
        if (obj != null && jVar.a(c5243r3.f41859c.c())) {
            c5100a2.f41056x = obj;
            c5100a2.f41053u.l(2);
        } else {
            u1.h hVar = c5100a2.f41053u;
            InterfaceC4992e interfaceC4992e = c5243r3.f41857a;
            com.bumptech.glide.load.data.d dVar = c5243r3.f41859c;
            hVar.a(interfaceC4992e, obj, dVar, dVar.c(), c5100a2.f41058z);
        }
    }

    @Override // androidx.emoji2.text.o
    public Object getResult() {
        return (x) this.f2910u;
    }

    public int hashCode() {
        switch (this.f2909n) {
            case 9:
                String str = (String) this.f2910u;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.f2911v;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h.m, java.lang.Object] */
    @Override // k.InterfaceC4613a
    public void i(AbstractC4614b abstractC4614b) {
        ((InterfaceC4613a) this.f2910u).i(abstractC4614b);
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) this.f2911v;
        if (layoutInflaterFactory2C4535B.f37994P != null) {
            layoutInflaterFactory2C4535B.f37975E.getDecorView().removeCallbacks(layoutInflaterFactory2C4535B.f37995Q);
        }
        if (layoutInflaterFactory2C4535B.f37993O != null) {
            C0343e0 c0343e0 = layoutInflaterFactory2C4535B.f37996R;
            if (c0343e0 != null) {
                c0343e0.b();
            }
            C0343e0 a9 = X.a(layoutInflaterFactory2C4535B.f37993O);
            a9.a(0.0f);
            layoutInflaterFactory2C4535B.f37996R = a9;
            a9.d(new t(2, this));
        }
        layoutInflaterFactory2C4535B.f37979G.onSupportActionModeFinished(layoutInflaterFactory2C4535B.f37992N);
        layoutInflaterFactory2C4535B.f37992N = null;
        ViewGroup viewGroup = layoutInflaterFactory2C4535B.f37998T;
        WeakHashMap weakHashMap = X.f2240a;
        J.c(viewGroup);
        layoutInflaterFactory2C4535B.K();
    }

    public void j(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f2910u).add(y.o(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    @Override // O.InterfaceC0358u
    public A0 k(View view, A0 a02) {
        A0 j9 = X.j(view, a02);
        if (j9.f2213a.m()) {
            return j9;
        }
        int b9 = j9.b();
        Rect rect = (Rect) this.f2910u;
        rect.left = b9;
        rect.top = j9.d();
        rect.right = j9.c();
        rect.bottom = j9.a();
        ViewPager viewPager = (ViewPager) this.f2911v;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            A0 b10 = X.b(viewPager.getChildAt(i), j9);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return j9.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean l(j jVar) {
        boolean containsKey;
        synchronized (this.f2910u) {
            containsKey = ((LinkedHashMap) this.f2911v).containsKey(jVar);
        }
        return containsKey;
    }

    public String n(InterfaceC4992e interfaceC4992e) {
        String str;
        synchronized (((N1.l) this.f2910u)) {
            str = (String) ((N1.l) this.f2910u).b(interfaceC4992e);
        }
        if (str == null) {
            C5152e c5152e = (C5152e) ((Y2.e) this.f2911v).l();
            try {
                interfaceC4992e.a(c5152e.f41592n);
                byte[] digest = c5152e.f41592n.digest();
                char[] cArr = N1.p.f1977b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b9 = digest[i];
                        int i4 = i * 2;
                        char[] cArr2 = N1.p.f1976a;
                        cArr[i4] = cArr2[(b9 & 255) >>> 4];
                        cArr[i4 + 1] = cArr2[b9 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((Y2.e) this.f2911v).G(c5152e);
            }
        }
        synchronized (((N1.l) this.f2910u)) {
            ((N1.l) this.f2910u).f(interfaceC4992e, str);
        }
        return str;
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public void onNativeAdLoadFail(AdError adError) {
        if (k4.m.f38791g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2911v);
            ViewGroup viewGroup = (ViewGroup) this.f2910u;
            View inflate = from.inflate(C5284R.layout.qureka_native, viewGroup, false);
            k4.m.d(inflate.findViewById(C5284R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.gif1);
            TextView textView = (TextView) inflate.findViewById(C5284R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5284R.id.desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(k4.m.f38785S[nextInt]);
            textView2.setText(k4.m.f38786T[nextInt]);
            gifImageView.setBackgroundResource(k4.m.f38787U[nextInt]);
            inflate.findViewById(C5284R.id.nativeclick).setOnClickListener(new com.google.android.material.datepicker.j(9, this));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public void onNativeAdLoaded() {
        NativeAd nativeAd = k4.m.f38770C.getNativeAd();
        if (k4.m.f38771D.getParent() == null) {
            ((ViewGroup) this.f2910u).addView(k4.m.f38771D);
        }
        k4.m.f38781O = new ATNativePrepareInfo();
        if (nativeAd == null) {
            return;
        }
        if (nativeAd.isNativeExpress()) {
            nativeAd.renderAdContainer(k4.m.f38771D, null);
        } else {
            Context context = (Context) this.f2911v;
            View inflate = LayoutInflater.from(context).inflate(C5284R.layout.topon_native, (ViewGroup) null);
            ATNativeMaterial adMaterial = nativeAd.getAdMaterial();
            ATNativePrepareInfo aTNativePrepareInfo = k4.m.f38781O;
            TextView textView = (TextView) inflate.findViewById(C5284R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5284R.id.native_ad_desc);
            TextView textView3 = (TextView) inflate.findViewById(C5284R.id.native_ad_install_btn);
            TextView textView4 = (TextView) inflate.findViewById(C5284R.id.native_ad_from);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C5284R.id.native_ad_image);
            FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C5284R.id.native_ad_content_image_area);
            ATNativeImageView aTNativeImageView = (ATNativeImageView) inflate.findViewById(C5284R.id.native_ad_logo);
            ArrayList arrayList = new ArrayList();
            String title = adMaterial.getTitle();
            String descriptionText = adMaterial.getDescriptionText();
            View adIconView = adMaterial.getAdIconView();
            String iconImageUrl = adMaterial.getIconImageUrl();
            String callToActionText = adMaterial.getCallToActionText();
            View adMediaView = adMaterial.getAdMediaView(frameLayout2);
            String adChoiceIconUrl = adMaterial.getAdChoiceIconUrl();
            String adFrom = adMaterial.getAdFrom();
            textView.setText(title);
            aTNativePrepareInfo.setTitleView(textView);
            arrayList.add(textView);
            textView2.setText(descriptionText);
            aTNativePrepareInfo.setDescView(textView2);
            arrayList.add(textView2);
            if (TextUtils.isEmpty(callToActionText)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(callToActionText);
            }
            aTNativePrepareInfo.setCtaView(textView3);
            arrayList.add(textView3);
            ATNativeImageView aTNativeImageView2 = new ATNativeImageView(context);
            if (adIconView == null) {
                frameLayout.addView(aTNativeImageView2);
                aTNativeImageView2.setImage(iconImageUrl);
                aTNativePrepareInfo.setIconView(aTNativeImageView2);
                arrayList.add(aTNativeImageView2);
            } else {
                frameLayout.addView(adIconView);
                aTNativePrepareInfo.setIconView(adIconView);
                arrayList.add(adIconView);
            }
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                adMediaView.setLayoutParams(layoutParams);
                frameLayout2.addView(adMediaView, layoutParams);
                arrayList.add(adMediaView);
            } else if (TextUtils.isEmpty(adMaterial.getVideoUrl())) {
                ATNativeImageView aTNativeImageView3 = new ATNativeImageView(context);
                aTNativeImageView3.setImage(adMaterial.getMainImageUrl());
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                aTNativeImageView3.setLayoutParams(layoutParams2);
                frameLayout2.addView(aTNativeImageView3, layoutParams2);
                aTNativePrepareInfo.setMainImageView(aTNativeImageView3);
                arrayList.add(aTNativeImageView3);
            } else {
                String videoUrl = adMaterial.getVideoUrl();
                VideoView videoView = new VideoView(context);
                videoView.setVideoURI(Uri.parse(videoUrl));
                videoView.setOnPreparedListener(new C4648c());
                videoView.start();
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                videoView.setLayoutParams(layoutParams3);
                frameLayout2.addView(videoView, layoutParams3);
                arrayList.add(videoView);
            }
            if (TextUtils.isEmpty(adFrom)) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(adFrom);
            }
            aTNativePrepareInfo.setAdFromView(textView4);
            if (!TextUtils.isEmpty(adChoiceIconUrl)) {
                aTNativeImageView.setImage(adChoiceIconUrl);
                aTNativePrepareInfo.setAdLogoView(aTNativeImageView);
            }
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) ((40.0f * context.getResources().getDisplayMetrics().density) + 0.5f), (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
            layoutParams4.gravity = 85;
            aTNativePrepareInfo.setChoiceViewLayoutParams(layoutParams4);
            aTNativePrepareInfo.setClickViewList(arrayList);
            if (aTNativePrepareInfo instanceof ATNativePrepareExInfo) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(textView3);
                ((ATNativePrepareExInfo) aTNativePrepareInfo).setCreativeClickViewList(arrayList2);
            }
            nativeAd = nativeAd;
            nativeAd.renderAdContainer(k4.m.f38771D, inflate);
        }
        nativeAd.prepare(k4.m.f38771D, k4.m.f38781O);
    }

    public void p() {
        ((SparseIntArray) this.f2910u).clear();
    }

    public void q(Context context, Uri uri) {
        Intent intent = (Intent) this.f2910u;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.f2911v);
    }

    public void r(L.f fVar) {
        int i = fVar.f1681b;
        Handler handler = (Handler) this.f2911v;
        C4523c c4523c = (C4523c) this.f2910u;
        if (i != 0) {
            handler.post(new L.a(c4523c, i, 0));
        } else {
            handler.post(new RunnableC0272f(11, c4523c, fVar.f1680a));
        }
    }

    public void s() {
        try {
            ((FileLock) this.f2911v).release();
            ((FileChannel) this.f2910u).close();
        } catch (IOException e6) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e6);
        }
    }

    public K0.j t(j jVar) {
        K0.j jVar2;
        synchronized (this.f2910u) {
            jVar2 = (K0.j) ((LinkedHashMap) this.f2911v).remove(jVar);
        }
        return jVar2;
    }

    public String toString() {
        switch (this.f2909n) {
            case 5:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f2911v.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f2910u;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 9:
                StringBuilder sb2 = new StringBuilder("Pair{");
                sb2.append(this.f2910u);
                sb2.append(" ");
                sb2.append(this.f2911v);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public List u(String workSpecId) {
        List R8;
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        synchronized (this.f2910u) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2911v;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.h.a(((j) entry.getKey()).f2905a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f2911v).remove((j) it.next());
                }
                R8 = AbstractC4979j.R(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return R8;
    }

    public K0.j v(j jVar) {
        K0.j jVar2;
        synchronized (this.f2910u) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2911v;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new K0.j(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                jVar2 = (K0.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar2;
    }

    public /* synthetic */ l(int i, boolean z8) {
        this.f2909n = i;
    }

    public /* synthetic */ l(Object obj, Object obj2, int i, boolean z8) {
        this.f2909n = i;
        this.f2911v = obj;
        this.f2910u = obj2;
    }

    public /* synthetic */ l(Object obj) {
        this.f2909n = 5;
        this.f2911v = obj;
        this.f2910u = new ArrayList();
    }

    public l(t2.s sVar, String str, t2.q qVar) {
        this.f2909n = 17;
        this.f2910u = str;
        this.f2911v = qVar;
        Objects.requireNonNull(sVar);
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f2909n = 0;
        this.f2910u = workDatabase_Impl;
        this.f2911v = new b(workDatabase_Impl, 3);
    }

    public l(int i) {
        this.f2909n = i;
        switch (i) {
            case 16:
                this.f2910u = new SparseIntArray();
                this.f2911v = new SparseIntArray();
                break;
            case 19:
                this.f2910u = new N1.l(1000L, 0);
                this.f2911v = O1.d.a(10, new W3.e(29));
                break;
            default:
                this.f2910u = new Object();
                this.f2911v = new LinkedHashMap();
                break;
        }
    }

    public l(ViewPager viewPager) {
        this.f2909n = 2;
        this.f2911v = viewPager;
        this.f2910u = new Rect();
    }
}
