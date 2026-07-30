package h4;

import com.crrepa.ble.conn.type.CRPProtocolVersion;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16744a = "MOYOUNG";

    /* renamed from: b, reason: collision with root package name */
    private static final String f16745b = "MOYOUNG-V2";

    /* renamed from: c, reason: collision with root package name */
    private static final String f16746c = "MOYOUNG-V3";

    private n() {
    }

    public static CRPProtocolVersion a(String str) {
        str.hashCode();
        return !str.equals(f16745b) ? !str.equals(f16746c) ? CRPProtocolVersion.V1 : CRPProtocolVersion.V3 : CRPProtocolVersion.V2;
    }
}
