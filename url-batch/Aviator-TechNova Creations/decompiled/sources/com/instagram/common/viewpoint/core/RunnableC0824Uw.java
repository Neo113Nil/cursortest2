package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0824Uw implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ SQ A00;
    public final /* synthetic */ C0827Uz A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, Ascii.VT, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC0824Uw(C0827Uz c0827Uz, String str, SQ sq) {
        this.A01 = c0827Uz;
        this.A02 = str;
        this.A00 = sq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            C0773Sw nvl = new C0773Sw(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, Opcodes.FNEG), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0826Uy c0826Uy = (C0826Uy) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i = c0826Uy.A00;
                StringBuilder append2 = append.append(i).append(';');
                i2 = c0826Uy.A02;
                StringBuilder append3 = append2.append(i2).append(';');
                i3 = c0826Uy.A01;
                jSONArray.put(append3.append(i3).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().AAz(A00(10, 9, Opcodes.LNEG), AbstractC0772Sv.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
