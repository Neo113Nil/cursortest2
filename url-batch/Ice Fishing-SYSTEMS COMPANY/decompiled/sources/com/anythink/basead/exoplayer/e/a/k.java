package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    private static final String f7279f = "TrackEncryptionBox";

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7280a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7281b;

    /* renamed from: c, reason: collision with root package name */
    public final m.a f7282c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7283d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7284e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.equals(com.anythink.basead.exoplayer.b.be) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(boolean z8, String str, int i, byte[] bArr, int i4, int i9, byte[] bArr2) {
        int i10 = 2;
        char c4 = 0;
        C0544a.a((i == 0) ^ (bArr2 == null));
        this.f7280a = z8;
        this.f7281b = str;
        this.f7283d = i;
        this.f7284e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals(com.anythink.basead.exoplayer.b.bg)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3049879:
                    if (str.equals(com.anythink.basead.exoplayer.b.bd)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3049895:
                    if (str.equals(com.anythink.basead.exoplayer.b.bf)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                    break;
                default:
                    Log.w(f7279f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i10 = 1;
                    break;
            }
            this.f7282c = new m.a(i10, bArr, i4, i9);
        }
        i10 = 1;
        this.f7282c = new m.a(i10, bArr, i4, i9);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c4 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(com.anythink.basead.exoplayer.b.be)) {
                    c4 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(com.anythink.basead.exoplayer.b.bg)) {
                    c4 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(com.anythink.basead.exoplayer.b.bd)) {
                    c4 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(com.anythink.basead.exoplayer.b.bf)) {
                    c4 = 3;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(f7279f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
