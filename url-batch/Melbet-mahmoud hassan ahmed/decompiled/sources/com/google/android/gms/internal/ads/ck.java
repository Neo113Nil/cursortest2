package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* loaded from: classes.dex */
final class ck {

    /* renamed from: a, reason: collision with root package name */
    private final ch[] f3855a;

    /* renamed from: b, reason: collision with root package name */
    private final dh f3856b;

    /* renamed from: c, reason: collision with root package name */
    private ch f3857c;

    public ck(ch[] chVarArr, dh dhVar) {
        this.f3855a = chVarArr;
        this.f3856b = dhVar;
    }

    public final void a() {
        if (this.f3857c != null) {
            this.f3857c = null;
        }
    }

    public final ch b(bh bhVar, Uri uri) {
        ch chVar = this.f3857c;
        if (chVar != null) {
            return chVar;
        }
        ch[] chVarArr = this.f3855a;
        int length = chVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            ch chVar2 = chVarArr[i7];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bhVar.e();
                throw th;
            }
            if (chVar2.d(bhVar)) {
                this.f3857c = chVar2;
                bhVar.e();
                break;
            }
            continue;
            bhVar.e();
            i7++;
        }
        ch chVar3 = this.f3857c;
        if (chVar3 != null) {
            chVar3.f(this.f3856b);
            return this.f3857c;
        }
        String k7 = zm.k(this.f3855a);
        StringBuilder sb = new StringBuilder(k7.length() + 58);
        sb.append("None of the available extractors (");
        sb.append(k7);
        sb.append(") could read the stream.");
        throw new bl(sb.toString(), uri);
    }
}
