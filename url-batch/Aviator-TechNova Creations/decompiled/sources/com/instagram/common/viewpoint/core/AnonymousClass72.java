package com.instagram.common.viewpoint.core;

import android.view.View;
import androidx.work.WorkRequest;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.72, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass72 extends AbstractC1405hQ {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C6M A02;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{Ascii.DC4, Ascii.ETB, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, Ascii.VT, 38, 55, Ascii.ESC, 40, 40, 37, 40, -42, 45, Ascii.RS, Ascii.US, 34, Ascii.ESC, -42, 38, Ascii.ETB, 40, 41, Ascii.US, 36, Ascii.GS, -42, Ascii.EM, Ascii.RS, Ascii.ETB, Ascii.US, 36, Ascii.ESC, Ascii.SUB, -42, Ascii.ETB, Ascii.SUB, 41, -42, -8, Ascii.ETB, 36, 36, Ascii.ESC, 40};
    }

    public AnonymousClass72(C6M c6m, NT nt) {
        super(c6m, nt);
        this.A00 = WorkRequest.MIN_BACKOFF_MILLIS;
        this.A02 = c6m;
    }

    private C1408hT A01(Runnable runnable) {
        return new C1408hT(this, runnable);
    }

    private List<JSONObject> A04(NU nu) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = nu.A03();
        if (A032.has(A03(22, 12, 71))) {
            try {
                this.A00 = A032.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String A033 = A03(36, 38, 101);
                this.A02.A0F().A5Y(V1.A01(AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC1471id interfaceC1471id, JSONObject jSONObject, TF tf) {
        this.A0C = false;
        C1407hS c1407hS = new C1407hS(this, interfaceC1471id, AbstractC0868Wr.A02(jSONObject, A03(34, 2, Opcodes.FREM)));
        A0H().postDelayed(c1407hS, tf.A05());
        interfaceC1471id.AAk(this.A02, this.A09, this.A08.A08, A01(c1407hS), jSONObject, tf);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4W();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4X();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final void A0R(MP mp, TE te, TC tc, final NU nu) {
        this.A02.A0F().A4Q();
        final InterfaceC1471id interfaceC1471id = (InterfaceC1471id) mp;
        if (interfaceC1471id.AJa()) {
            final List<JSONObject> A04 = A04(nu);
            A06(interfaceC1471id, A04.get(0), nu.A01());
            if (A04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.NV
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass72.this.A0a(interfaceC1471id, A04, nu);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC1471id, nu.A03(), nu.A01());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final void A0U(String str) {
        this.A02.A0F().A4V(str != null);
        super.A0U(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1405hQ
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC1471id interfaceC1471id, List list, NU nu) {
        A06(interfaceC1471id, (JSONObject) list.get(1), nu.A01());
    }
}
