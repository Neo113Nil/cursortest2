package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bad implements bmc {
    final /* synthetic */ azj a;
    final /* synthetic */ List b;
    final /* synthetic */ bkr c;
    private boolean d;

    public bad(azj azjVar, List list, bkr bkrVar) {
        this.a = azjVar;
        this.b = list;
        this.c = bkrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0131 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00af, blocks: (B:43:0x0078, B:45:0x0080, B:47:0x009f, B:15:0x0131, B:19:0x014c, B:22:0x01a6, B:25:0x0243, B:29:0x031d), top: B:42:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014c A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00af, blocks: (B:43:0x0078, B:45:0x0080, B:47:0x009f, B:15:0x0131, B:19:0x014c, B:22:0x01a6, B:25:0x0243, B:29:0x031d), top: B:42:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a6 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00af, blocks: (B:43:0x0078, B:45:0x0080, B:47:0x009f, B:15:0x0131, B:19:0x014c, B:22:0x01a6, B:25:0x0243, B:29:0x031d), top: B:42:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0243 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00af, blocks: (B:43:0x0078, B:45:0x0080, B:47:0x009f, B:15:0x0131, B:19:0x014c, B:22:0x01a6, B:25:0x0243, B:29:0x031d), top: B:42:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031d A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00af, blocks: (B:43:0x0078, B:45:0x0080, B:47:0x009f, B:15:0x0131, B:19:0x014c, B:22:0x01a6, B:25:0x0243, B:29:0x031d), top: B:42:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    @Override // defpackage.bmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object a() {
        boolean z;
        bbn bikVar;
        bhf bhfVar;
        bip bipVar;
        bkr bkrVar;
        bjf bjfVar;
        Class cls;
        String str;
        bad badVar = this;
        if (badVar.d) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        yk.f("Glide registry");
        badVar.d = true;
        try {
            azj azjVar = badVar.a;
            List list = badVar.b;
            bkr bkrVar2 = badVar.c;
            bed bedVar = azjVar.b;
            bek bekVar = azjVar.e;
            azu azuVar = azjVar.c;
            Context applicationContext = azuVar.getApplicationContext();
            brn brnVar = azuVar.h;
            bac bacVar = new bac();
            bacVar.i(new bhm());
            bacVar.i(new bib());
            Resources resources = applicationContext.getResources();
            List b = bacVar.b();
            bjh bjhVar = new bjh(applicationContext, b, bedVar, bekVar);
            try {
                bix bixVar = new bix(bedVar, new biu(2));
                bhx bhxVar = new bhx(bacVar.b(), resources.getDisplayMetrics(), bedVar, bekVar, brnVar);
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        if (brnVar.v(azl.class)) {
                            bikVar = new bik(b, brnVar.v(azs.class), bekVar, brnVar.v(azq.class));
                            bhfVar = new bhf(0);
                            if (!brnVar.v(azm.class)) {
                                bkrVar = bkrVar2;
                                bipVar = null;
                                bacVar.g("Animation", InputStream.class, Drawable.class, new bhf(new afr(b, bekVar), 4));
                                bacVar.g("Animation", ByteBuffer.class, Drawable.class, new bhf(new afr(b, bekVar), 3));
                                bjf bjfVar2 = new bjf(applicationContext);
                                bhc bhcVar = new bhc(bekVar);
                                bjq bjqVar = new bjq(1);
                                bjt bjtVar = new bjt(1);
                                ContentResolver contentResolver = applicationContext.getContentResolver();
                                bacVar.d(ByteBuffer.class, new bfj());
                                bacVar.d(InputStream.class, new bgl(bekVar));
                                bacVar.g("Bitmap", ByteBuffer.class, Bitmap.class, bhfVar);
                                bacVar.g("Bitmap", InputStream.class, Bitmap.class, bikVar);
                                if (bipVar != null) {
                                }
                                if (bci.d()) {
                                }
                                bacVar.g("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bix(bedVar, new biu(1)));
                                bacVar.g("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bixVar);
                                bgq bgqVar = bgq.a;
                                bacVar.f(Bitmap.class, Bitmap.class, bgqVar);
                                bacVar.g("Bitmap", Bitmap.class, Bitmap.class, new bjg(1));
                                bacVar.e(Bitmap.class, bhcVar);
                                bacVar.g("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bha(resources, bhfVar));
                                bacVar.g("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bha(resources, bikVar));
                                bacVar.g("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bha(resources, bixVar));
                                if (bipVar != null) {
                                }
                                bacVar.e(BitmapDrawable.class, new bhb(bedVar, bhcVar));
                                String str2 = str;
                                bacVar.g(str2, InputStream.class, bjj.class, new bjp(b, bjhVar, bekVar));
                                bacVar.g(str2, ByteBuffer.class, bjj.class, bjhVar);
                                bacVar.e(bjj.class, new bjk());
                                bacVar.f(bar.class, bar.class, bgqVar);
                                bacVar.g("Bitmap", bar.class, Bitmap.class, new bhf(bedVar, 5));
                                bjf bjfVar3 = bjfVar;
                                Class cls2 = cls;
                                bacVar.g("legacy_append", Uri.class, cls2, bjfVar3);
                                bacVar.g("legacy_append", Uri.class, Bitmap.class, new bip(bjfVar3, bedVar, 1));
                                bacVar.j(new biy());
                                bacVar.f(File.class, ByteBuffer.class, new bfi(2));
                                bacVar.f(File.class, InputStream.class, new bfq(new bft(0), 0));
                                bacVar.g("legacy_append", File.class, File.class, new bjg(2));
                                bacVar.f(File.class, ParcelFileDescriptor.class, new bfq(new bft(1), 0));
                                bacVar.f(File.class, File.class, bgqVar);
                                bacVar.j(new bce(bekVar));
                                if (bci.d()) {
                                }
                                bfm bfmVar = new bfm(applicationContext, 2);
                                bfm bfmVar2 = new bfm(applicationContext, 1);
                                bfm bfmVar3 = new bfm(applicationContext, 0);
                                bacVar.f(Integer.TYPE, InputStream.class, bfmVar);
                                bacVar.f(Integer.class, InputStream.class, bfmVar);
                                bacVar.f(Integer.TYPE, AssetFileDescriptor.class, bfmVar2);
                                bacVar.f(Integer.class, AssetFileDescriptor.class, bfmVar2);
                                bacVar.f(Integer.TYPE, cls2, bfmVar3);
                                bacVar.f(Integer.class, cls2, bfmVar3);
                                bacVar.f(Uri.class, InputStream.class, new bfq(applicationContext, 3));
                                bacVar.f(Uri.class, AssetFileDescriptor.class, new bfq(applicationContext, 2));
                                bgk bgkVar = new bgk(resources, 3);
                                bgk bgkVar2 = new bgk(resources, 0);
                                bgk bgkVar3 = new bgk(resources, 2);
                                bacVar.f(Integer.class, Uri.class, bgkVar);
                                bacVar.f(Integer.TYPE, Uri.class, bgkVar);
                                bacVar.f(Integer.class, AssetFileDescriptor.class, bgkVar2);
                                bacVar.f(Integer.TYPE, AssetFileDescriptor.class, bgkVar2);
                                bacVar.f(Integer.class, InputStream.class, bgkVar3);
                                bacVar.f(Integer.TYPE, InputStream.class, bgkVar3);
                                bacVar.f(String.class, InputStream.class, new bfq(1));
                                bacVar.f(Uri.class, InputStream.class, new bfq(1));
                                bacVar.f(String.class, InputStream.class, new bfi(5));
                                bacVar.f(String.class, ParcelFileDescriptor.class, new bfi(4));
                                bacVar.f(String.class, AssetFileDescriptor.class, new bfi(3));
                                bacVar.f(Uri.class, InputStream.class, new bfe(applicationContext.getAssets(), 0));
                                bacVar.f(Uri.class, AssetFileDescriptor.class, new bfe(applicationContext.getAssets(), 1));
                                bacVar.f(Uri.class, InputStream.class, new bgk(applicationContext, 5));
                                bacVar.f(Uri.class, InputStream.class, new bgk(applicationContext, 6));
                                if (Build.VERSION.SDK_INT >= 29) {
                                }
                                boolean v = brnVar.v(azt.class);
                                bacVar.f(Uri.class, InputStream.class, new bgn(contentResolver, v, 2));
                                bacVar.f(Uri.class, ParcelFileDescriptor.class, new bgn(contentResolver, v, 0));
                                bacVar.f(Uri.class, AssetFileDescriptor.class, new bgn(contentResolver, v, 1));
                                bacVar.f(Uri.class, InputStream.class, new bgq(0));
                                bacVar.f(URL.class, InputStream.class, new bgq(2));
                                bacVar.f(Uri.class, File.class, new bgk(applicationContext, 1));
                                bacVar.f(bfv.class, InputStream.class, new bgk(4));
                                bacVar.f(byte[].class, ByteBuffer.class, new bfi(1));
                                bacVar.f(byte[].class, InputStream.class, new bfi(0));
                                bacVar.f(Uri.class, Uri.class, bgqVar);
                                bacVar.f(cls2, cls2, bgqVar);
                                bacVar.g("legacy_append", cls2, cls2, new bjg(0));
                                bacVar.k(Bitmap.class, BitmapDrawable.class, new bjq(resources, 0));
                                bacVar.k(Bitmap.class, byte[].class, bjqVar);
                                bacVar.k(cls2, byte[].class, new bjr(bedVar, bjqVar, bjtVar));
                                bacVar.k(bjj.class, byte[].class, bjtVar);
                                bix bixVar2 = new bix(bedVar, new biu(0));
                                bacVar.g("legacy_append", ByteBuffer.class, Bitmap.class, bixVar2);
                                bacVar.g("legacy_append", ByteBuffer.class, BitmapDrawable.class, new bha(resources, bixVar2));
                                afg.f(applicationContext, azjVar, bacVar, list, bkrVar);
                                this.d = false;
                                Trace.endSection();
                                return bacVar;
                            }
                            bipVar = new bip(applicationContext, 2);
                            bkrVar = bkrVar2;
                            bhfVar = bhfVar;
                            bacVar.g("Animation", InputStream.class, Drawable.class, new bhf(new afr(b, bekVar), 4));
                            bacVar.g("Animation", ByteBuffer.class, Drawable.class, new bhf(new afr(b, bekVar), 3));
                            bjf bjfVar22 = new bjf(applicationContext);
                            bhc bhcVar2 = new bhc(bekVar);
                            bjq bjqVar2 = new bjq(1);
                            bjt bjtVar2 = new bjt(1);
                            ContentResolver contentResolver2 = applicationContext.getContentResolver();
                            bacVar.d(ByteBuffer.class, new bfj());
                            bacVar.d(InputStream.class, new bgl(bekVar));
                            bacVar.g("Bitmap", ByteBuffer.class, Bitmap.class, bhfVar);
                            bacVar.g("Bitmap", InputStream.class, Bitmap.class, bikVar);
                            if (bipVar != null) {
                                bacVar.h(Uri.class, Bitmap.class, bipVar);
                                bjfVar = bjfVar22;
                                cls = Drawable.class;
                                bacVar.h.G(Uri.class, Uri.class, bgq.a);
                            } else {
                                bjfVar = bjfVar22;
                                cls = Drawable.class;
                            }
                            if (bci.d()) {
                                str = "Animation";
                                bacVar.g("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new bhf(bhxVar, 2));
                            } else {
                                str = "Animation";
                            }
                            bacVar.g("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bix(bedVar, new biu(1)));
                            bacVar.g("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bixVar);
                            bgq bgqVar2 = bgq.a;
                            bacVar.f(Bitmap.class, Bitmap.class, bgqVar2);
                            bacVar.g("Bitmap", Bitmap.class, Bitmap.class, new bjg(1));
                            bacVar.e(Bitmap.class, bhcVar2);
                            bacVar.g("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bha(resources, bhfVar));
                            bacVar.g("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bha(resources, bikVar));
                            bacVar.g("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bha(resources, bixVar));
                            if (bipVar != null) {
                                bacVar.h(Uri.class, BitmapDrawable.class, new bha(resources, bipVar));
                            }
                            bacVar.e(BitmapDrawable.class, new bhb(bedVar, bhcVar2));
                            String str22 = str;
                            bacVar.g(str22, InputStream.class, bjj.class, new bjp(b, bjhVar, bekVar));
                            bacVar.g(str22, ByteBuffer.class, bjj.class, bjhVar);
                            bacVar.e(bjj.class, new bjk());
                            bacVar.f(bar.class, bar.class, bgqVar2);
                            bacVar.g("Bitmap", bar.class, Bitmap.class, new bhf(bedVar, 5));
                            bjf bjfVar32 = bjfVar;
                            Class cls22 = cls;
                            bacVar.g("legacy_append", Uri.class, cls22, bjfVar32);
                            bacVar.g("legacy_append", Uri.class, Bitmap.class, new bip(bjfVar32, bedVar, 1));
                            bacVar.j(new biy());
                            bacVar.f(File.class, ByteBuffer.class, new bfi(2));
                            bacVar.f(File.class, InputStream.class, new bfq(new bft(0), 0));
                            bacVar.g("legacy_append", File.class, File.class, new bjg(2));
                            bacVar.f(File.class, ParcelFileDescriptor.class, new bfq(new bft(1), 0));
                            bacVar.f(File.class, File.class, bgqVar2);
                            bacVar.j(new bce(bekVar));
                            if (bci.d()) {
                                bacVar.j(new bch());
                            }
                            bfm bfmVar4 = new bfm(applicationContext, 2);
                            bfm bfmVar22 = new bfm(applicationContext, 1);
                            bfm bfmVar32 = new bfm(applicationContext, 0);
                            bacVar.f(Integer.TYPE, InputStream.class, bfmVar4);
                            bacVar.f(Integer.class, InputStream.class, bfmVar4);
                            bacVar.f(Integer.TYPE, AssetFileDescriptor.class, bfmVar22);
                            bacVar.f(Integer.class, AssetFileDescriptor.class, bfmVar22);
                            bacVar.f(Integer.TYPE, cls22, bfmVar32);
                            bacVar.f(Integer.class, cls22, bfmVar32);
                            bacVar.f(Uri.class, InputStream.class, new bfq(applicationContext, 3));
                            bacVar.f(Uri.class, AssetFileDescriptor.class, new bfq(applicationContext, 2));
                            bgk bgkVar4 = new bgk(resources, 3);
                            bgk bgkVar22 = new bgk(resources, 0);
                            bgk bgkVar32 = new bgk(resources, 2);
                            bacVar.f(Integer.class, Uri.class, bgkVar4);
                            bacVar.f(Integer.TYPE, Uri.class, bgkVar4);
                            bacVar.f(Integer.class, AssetFileDescriptor.class, bgkVar22);
                            bacVar.f(Integer.TYPE, AssetFileDescriptor.class, bgkVar22);
                            bacVar.f(Integer.class, InputStream.class, bgkVar32);
                            bacVar.f(Integer.TYPE, InputStream.class, bgkVar32);
                            bacVar.f(String.class, InputStream.class, new bfq(1));
                            bacVar.f(Uri.class, InputStream.class, new bfq(1));
                            bacVar.f(String.class, InputStream.class, new bfi(5));
                            bacVar.f(String.class, ParcelFileDescriptor.class, new bfi(4));
                            bacVar.f(String.class, AssetFileDescriptor.class, new bfi(3));
                            bacVar.f(Uri.class, InputStream.class, new bfe(applicationContext.getAssets(), 0));
                            bacVar.f(Uri.class, AssetFileDescriptor.class, new bfe(applicationContext.getAssets(), 1));
                            bacVar.f(Uri.class, InputStream.class, new bgk(applicationContext, 5));
                            bacVar.f(Uri.class, InputStream.class, new bgk(applicationContext, 6));
                            if (Build.VERSION.SDK_INT >= 29) {
                                bacVar.f(Uri.class, InputStream.class, new bgt(applicationContext, InputStream.class));
                                bacVar.f(Uri.class, ParcelFileDescriptor.class, new bgt(applicationContext, ParcelFileDescriptor.class));
                            }
                            boolean v2 = brnVar.v(azt.class);
                            bacVar.f(Uri.class, InputStream.class, new bgn(contentResolver2, v2, 2));
                            bacVar.f(Uri.class, ParcelFileDescriptor.class, new bgn(contentResolver2, v2, 0));
                            bacVar.f(Uri.class, AssetFileDescriptor.class, new bgn(contentResolver2, v2, 1));
                            bacVar.f(Uri.class, InputStream.class, new bgq(0));
                            bacVar.f(URL.class, InputStream.class, new bgq(2));
                            bacVar.f(Uri.class, File.class, new bgk(applicationContext, 1));
                            bacVar.f(bfv.class, InputStream.class, new bgk(4));
                            bacVar.f(byte[].class, ByteBuffer.class, new bfi(1));
                            bacVar.f(byte[].class, InputStream.class, new bfi(0));
                            bacVar.f(Uri.class, Uri.class, bgqVar2);
                            bacVar.f(cls22, cls22, bgqVar2);
                            bacVar.g("legacy_append", cls22, cls22, new bjg(0));
                            bacVar.k(Bitmap.class, BitmapDrawable.class, new bjq(resources, 0));
                            bacVar.k(Bitmap.class, byte[].class, bjqVar2);
                            bacVar.k(cls22, byte[].class, new bjr(bedVar, bjqVar2, bjtVar2));
                            bacVar.k(bjj.class, byte[].class, bjtVar2);
                            bix bixVar22 = new bix(bedVar, new biu(0));
                            bacVar.g("legacy_append", ByteBuffer.class, Bitmap.class, bixVar22);
                            bacVar.g("legacy_append", ByteBuffer.class, BitmapDrawable.class, new bha(resources, bixVar22));
                            afg.f(applicationContext, azjVar, bacVar, list, bkrVar);
                            this.d = false;
                            Trace.endSection();
                            return bacVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        badVar = this;
                        badVar.d = z;
                        Trace.endSection();
                        throw th;
                    }
                }
                bhfVar = new bhf(bhxVar, 1);
                bikVar = new bip(bhxVar, bekVar, 0);
                bkrVar = bkrVar2;
                bipVar = null;
                bacVar.g("Animation", InputStream.class, Drawable.class, new bhf(new afr(b, bekVar), 4));
                bacVar.g("Animation", ByteBuffer.class, Drawable.class, new bhf(new afr(b, bekVar), 3));
                bjf bjfVar222 = new bjf(applicationContext);
                bhc bhcVar22 = new bhc(bekVar);
                bjq bjqVar22 = new bjq(1);
                bjt bjtVar22 = new bjt(1);
                ContentResolver contentResolver22 = applicationContext.getContentResolver();
                bacVar.d(ByteBuffer.class, new bfj());
                bacVar.d(InputStream.class, new bgl(bekVar));
                bacVar.g("Bitmap", ByteBuffer.class, Bitmap.class, bhfVar);
                bacVar.g("Bitmap", InputStream.class, Bitmap.class, bikVar);
                if (bipVar != null) {
                }
                if (bci.d()) {
                }
                bacVar.g("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bix(bedVar, new biu(1)));
                bacVar.g("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bixVar);
                bgq bgqVar22 = bgq.a;
                bacVar.f(Bitmap.class, Bitmap.class, bgqVar22);
                bacVar.g("Bitmap", Bitmap.class, Bitmap.class, new bjg(1));
                bacVar.e(Bitmap.class, bhcVar22);
                bacVar.g("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bha(resources, bhfVar));
                bacVar.g("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bha(resources, bikVar));
                bacVar.g("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bha(resources, bixVar));
                if (bipVar != null) {
                }
                bacVar.e(BitmapDrawable.class, new bhb(bedVar, bhcVar22));
                String str222 = str;
                bacVar.g(str222, InputStream.class, bjj.class, new bjp(b, bjhVar, bekVar));
                bacVar.g(str222, ByteBuffer.class, bjj.class, bjhVar);
                bacVar.e(bjj.class, new bjk());
                bacVar.f(bar.class, bar.class, bgqVar22);
                bacVar.g("Bitmap", bar.class, Bitmap.class, new bhf(bedVar, 5));
                bjf bjfVar322 = bjfVar;
                Class cls222 = cls;
                bacVar.g("legacy_append", Uri.class, cls222, bjfVar322);
                bacVar.g("legacy_append", Uri.class, Bitmap.class, new bip(bjfVar322, bedVar, 1));
                bacVar.j(new biy());
                bacVar.f(File.class, ByteBuffer.class, new bfi(2));
                bacVar.f(File.class, InputStream.class, new bfq(new bft(0), 0));
                bacVar.g("legacy_append", File.class, File.class, new bjg(2));
                bacVar.f(File.class, ParcelFileDescriptor.class, new bfq(new bft(1), 0));
                bacVar.f(File.class, File.class, bgqVar22);
                bacVar.j(new bce(bekVar));
                if (bci.d()) {
                }
                bfm bfmVar42 = new bfm(applicationContext, 2);
                bfm bfmVar222 = new bfm(applicationContext, 1);
                bfm bfmVar322 = new bfm(applicationContext, 0);
                bacVar.f(Integer.TYPE, InputStream.class, bfmVar42);
                bacVar.f(Integer.class, InputStream.class, bfmVar42);
                bacVar.f(Integer.TYPE, AssetFileDescriptor.class, bfmVar222);
                bacVar.f(Integer.class, AssetFileDescriptor.class, bfmVar222);
                bacVar.f(Integer.TYPE, cls222, bfmVar322);
                bacVar.f(Integer.class, cls222, bfmVar322);
                bacVar.f(Uri.class, InputStream.class, new bfq(applicationContext, 3));
                bacVar.f(Uri.class, AssetFileDescriptor.class, new bfq(applicationContext, 2));
                bgk bgkVar42 = new bgk(resources, 3);
                bgk bgkVar222 = new bgk(resources, 0);
                bgk bgkVar322 = new bgk(resources, 2);
                bacVar.f(Integer.class, Uri.class, bgkVar42);
                bacVar.f(Integer.TYPE, Uri.class, bgkVar42);
                bacVar.f(Integer.class, AssetFileDescriptor.class, bgkVar222);
                bacVar.f(Integer.TYPE, AssetFileDescriptor.class, bgkVar222);
                bacVar.f(Integer.class, InputStream.class, bgkVar322);
                bacVar.f(Integer.TYPE, InputStream.class, bgkVar322);
                bacVar.f(String.class, InputStream.class, new bfq(1));
                bacVar.f(Uri.class, InputStream.class, new bfq(1));
                bacVar.f(String.class, InputStream.class, new bfi(5));
                bacVar.f(String.class, ParcelFileDescriptor.class, new bfi(4));
                bacVar.f(String.class, AssetFileDescriptor.class, new bfi(3));
                bacVar.f(Uri.class, InputStream.class, new bfe(applicationContext.getAssets(), 0));
                bacVar.f(Uri.class, AssetFileDescriptor.class, new bfe(applicationContext.getAssets(), 1));
                bacVar.f(Uri.class, InputStream.class, new bgk(applicationContext, 5));
                bacVar.f(Uri.class, InputStream.class, new bgk(applicationContext, 6));
                if (Build.VERSION.SDK_INT >= 29) {
                }
                boolean v22 = brnVar.v(azt.class);
                bacVar.f(Uri.class, InputStream.class, new bgn(contentResolver22, v22, 2));
                bacVar.f(Uri.class, ParcelFileDescriptor.class, new bgn(contentResolver22, v22, 0));
                bacVar.f(Uri.class, AssetFileDescriptor.class, new bgn(contentResolver22, v22, 1));
                bacVar.f(Uri.class, InputStream.class, new bgq(0));
                bacVar.f(URL.class, InputStream.class, new bgq(2));
                bacVar.f(Uri.class, File.class, new bgk(applicationContext, 1));
                bacVar.f(bfv.class, InputStream.class, new bgk(4));
                bacVar.f(byte[].class, ByteBuffer.class, new bfi(1));
                bacVar.f(byte[].class, InputStream.class, new bfi(0));
                bacVar.f(Uri.class, Uri.class, bgqVar22);
                bacVar.f(cls222, cls222, bgqVar22);
                bacVar.g("legacy_append", cls222, cls222, new bjg(0));
                bacVar.k(Bitmap.class, BitmapDrawable.class, new bjq(resources, 0));
                bacVar.k(Bitmap.class, byte[].class, bjqVar22);
                bacVar.k(cls222, byte[].class, new bjr(bedVar, bjqVar22, bjtVar22));
                bacVar.k(bjj.class, byte[].class, bjtVar22);
                bix bixVar222 = new bix(bedVar, new biu(0));
                bacVar.g("legacy_append", ByteBuffer.class, Bitmap.class, bixVar222);
                bacVar.g("legacy_append", ByteBuffer.class, BitmapDrawable.class, new bha(resources, bixVar222));
                afg.f(applicationContext, azjVar, bacVar, list, bkrVar);
                this.d = false;
                Trace.endSection();
                return bacVar;
            } catch (Throwable th2) {
                th = th2;
                badVar = this;
                z = false;
                badVar.d = z;
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
