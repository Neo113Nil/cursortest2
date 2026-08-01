package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YL implements InterfaceC02765u {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final R6 A01;
    public Set<InterfaceC02795x> A00 = new HashSet();
    public final List<InterfaceC02785w> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, Ascii.VT, -46, -72, -67, Ascii.VT, 41, 59, 59, 45, 60, 59};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public synchronized void A03() {
        if (!this.A01.A90()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC02795x> A01 = A01(this.A01.A6b());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            Iterator<InterfaceC02785w> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A3Z();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC02795x interfaceC02795x : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC02795x.A84(), interfaceC02795x.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public YL(InterfaceC0514Ge interfaceC0514Ge) {
        R6 A4e = interfaceC0514Ge.A4e(R7.A0B);
        this.A01 = A4e;
        A4e.A3N(new YM(this));
        A03();
    }

    public static Set<InterfaceC02795x> A01(JSONObject jSONObject) {
        YK A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null || (A00 = YK.A00(optJSONObject)) == null) {
                return null;
            }
            hashSet.add(A00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02765u
    public final void A3L(InterfaceC02785w interfaceC02785w) {
        this.A02.add(interfaceC02785w);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02765u
    public final synchronized Set<InterfaceC02795x> A5x() {
        return new HashSet(this.A00);
    }
}
