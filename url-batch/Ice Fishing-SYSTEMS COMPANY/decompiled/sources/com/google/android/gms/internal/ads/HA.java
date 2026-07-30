package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class HA extends AbstractBinderC3186f8 {

    /* renamed from: n, reason: collision with root package name */
    public final h8.d f25316n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IA f25317u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HA(IA ia, h8.d dVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        Objects.requireNonNull(ia);
        this.f25317u = ia;
        this.f25316n = dVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C2631Jq c2631Jq;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
        AbstractC3241g8.f(parcel);
        int i4 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i9 = bundle.getInt("uiMode", 0);
        byte b9 = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b10 = (byte) (b9 | 2);
        Boolean valueOf = bundle.containsKey("userInteracted") ? Boolean.valueOf(bundle.getBoolean("userInteracted")) : null;
        if (b10 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb.append(" statusCode");
            }
            if ((b10 & 2) == 0) {
                sb.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        this.f25316n.p(new FA(i4, string, i9, valueOf));
        if (i4 == 8157 && (c2631Jq = this.f25317u.f25534a) != null) {
            IA.f25532c.a("unbind LMD display overlay service", new Object[0]);
            c2631Jq.a(new RunnableC3873rw(10, c2631Jq));
        }
        return true;
    }
}
