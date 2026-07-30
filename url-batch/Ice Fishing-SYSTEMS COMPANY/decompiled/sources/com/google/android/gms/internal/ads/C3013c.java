package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3013c implements InterfaceC2916aB {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3554m f29618n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3286h f29619u;

    public /* synthetic */ C3013c(C3554m c3554m, C3286h c3286h) {
        this.f29618n = c3554m;
        this.f29619u = c3286h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r9 != 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r9.f26079b != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2916aB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        Boolean bool;
        int i;
        L l9;
        Spatializer spatializer;
        boolean isAvailable;
        Spatializer spatializer2;
        boolean isEnabled;
        boolean z8;
        boolean isAvailable2;
        Spatializer spatializer3;
        boolean isEnabled2;
        int i4;
        int i9;
        char c4;
        TP tp = (TP) obj;
        C3554m c3554m = this.f29618n;
        c3554m.getClass();
        if (this.f29619u.f31121A && (((bool = c3554m.i) == null || !bool.booleanValue()) && (i = tp.f27754G) != -1 && i > 2)) {
            String str = tp.f27776o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f8578B)) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187078296:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f8625z)) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1504578661:
                        if (str.equals(com.anythink.basead.exoplayer.k.o.f8577A)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                if (c4 != 0) {
                    if (c4 != 1) {
                        if (c4 != 2) {
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                    L l10 = c3554m.f32636g;
                    if (l10 != null) {
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 32 && (l9 = c3554m.f32636g) != null && l9.f26079b && (spatializer = l9.f26078a) != null) {
                isAvailable = spatializer.isAvailable();
                if (isAvailable && (spatializer2 = c3554m.f32636g.f26078a) != null) {
                    isEnabled = spatializer2.isEnabled();
                    if (isEnabled) {
                        L l11 = c3554m.f32636g;
                        C2777Sj c2777Sj = c3554m.f32637h;
                        Spatializer spatializer4 = l11.f26078a;
                        if (spatializer4 != null && l11.f26079b) {
                            isAvailable2 = spatializer4.isAvailable();
                            if (isAvailable2 && (spatializer3 = l11.f26078a) != null) {
                                isEnabled2 = spatializer3.isEnabled();
                                if (isEnabled2) {
                                    boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8578B);
                                    int i10 = tp.f27754G;
                                    if (equals) {
                                        if (i10 == 16) {
                                            i4 = 12;
                                            i9 = tp.f27755H;
                                            if (i9 != -1 || i10 != i4) {
                                                i9 = AbstractC3548lu.e(i4);
                                            }
                                            if (i9 != 0) {
                                                AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i9);
                                                int i11 = tp.f27756I;
                                                if (i11 != -1) {
                                                    channelMask.setSampleRate(i11);
                                                }
                                                Spatializer spatializer5 = l11.f26078a;
                                                spatializer5.getClass();
                                                z8 = P.d.c(spatializer5).canBeSpatialized(c2777Sj.a(), channelMask.build());
                                                if (!z8) {
                                                }
                                            }
                                        }
                                        i4 = i10;
                                        i9 = tp.f27755H;
                                        if (i9 != -1) {
                                        }
                                        i9 = AbstractC3548lu.e(i4);
                                        if (i9 != 0) {
                                        }
                                    } else if (Objects.equals(str, "audio/iamf")) {
                                        if (i10 == -1) {
                                            i4 = 6;
                                            i9 = tp.f27755H;
                                            if (i9 != -1) {
                                            }
                                            i9 = AbstractC3548lu.e(i4);
                                            if (i9 != 0) {
                                            }
                                        }
                                        i4 = i10;
                                        i9 = tp.f27755H;
                                        if (i9 != -1) {
                                        }
                                        i9 = AbstractC3548lu.e(i4);
                                        if (i9 != 0) {
                                        }
                                    } else {
                                        if (Objects.equals(str, "audio/ac4") && (i10 == 18 || i10 == 21)) {
                                            i4 = 24;
                                            i9 = tp.f27755H;
                                            if (i9 != -1) {
                                            }
                                            i9 = AbstractC3548lu.e(i4);
                                            if (i9 != 0) {
                                            }
                                        }
                                        i4 = i10;
                                        i9 = tp.f27755H;
                                        if (i9 != -1) {
                                        }
                                        i9 = AbstractC3548lu.e(i4);
                                        if (i9 != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        z8 = false;
                        if (!z8) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
