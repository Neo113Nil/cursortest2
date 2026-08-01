package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0998Zf implements LE<Bundle> {
    public static byte[] A03;
    public final C2F A00;
    public final InterfaceC0744Ph A01;
    public final List<C0997Ze> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C0998Zf(List<C2D> list, Bundle bundle, InterfaceC0744Ph interfaceC0744Ph) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0744Ph;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C0997Ze(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C2F) L8.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C0998Zf(List<C2D> list, InterfaceC0744Ph interfaceC0744Ph) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0744Ph;
        Iterator<C2D> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C0997Ze(it.next()));
        }
        this.A00 = new C2F();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), L8.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C0997Ze> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2F A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C0997Ze> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.A00.A05(d, d2);
        }
        double A8B = this.A01.A8B();
        this.A00.A04(d, A8B);
        Iterator<C0997Ze> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, A8B);
        }
    }
}
