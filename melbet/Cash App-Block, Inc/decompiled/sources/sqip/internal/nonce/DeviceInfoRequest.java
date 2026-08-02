package sqip.internal.nonce;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003JÇ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010E\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\fHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001f¨\u0006I"}, d2 = {"Lsqip/internal/nonce/DeviceInfoRequest;", "", "s0", "", "s1", "", "s2", "s3", "s4", "s6", "s7", "s8", "", "s9", "s10", "s12", "s13", "", "s14", "s15", "s16", "s17", "s18", "s19", "s20", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZFLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getS0", "()Ljava/lang/String;", "getS1", "()Z", "getS10", "()I", "getS12", "getS13", "()F", "getS14", "getS15", "getS16", "getS17", "getS18", "getS19", "getS2", "getS20", "getS3", "getS4", "getS6", "getS7", "getS8", "getS9", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DeviceInfoRequest {
    private final String s0;
    private final boolean s1;
    private final int s10;
    private final boolean s12;
    private final float s13;
    private final String s14;
    private final String s15;
    private final boolean s16;
    private final String s17;
    private final String s18;
    private final String s19;
    private final boolean s2;
    private final String s20;
    private final String s3;
    private final String s4;
    private final String s6;
    private final String s7;
    private final int s8;
    private final int s9;

    public DeviceInfoRequest(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z3, float f, String str6, String str7, boolean z4, String str8, String str9, String str10, String str11) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
        str11.getClass();
        this.s0 = str;
        this.s1 = z;
        this.s2 = z2;
        this.s3 = str2;
        this.s4 = str3;
        this.s6 = str4;
        this.s7 = str5;
        this.s8 = i;
        this.s9 = i2;
        this.s10 = i3;
        this.s12 = z3;
        this.s13 = f;
        this.s14 = str6;
        this.s15 = str7;
        this.s16 = z4;
        this.s17 = str8;
        this.s18 = str9;
        this.s19 = str10;
        this.s20 = str11;
    }

    public static /* synthetic */ DeviceInfoRequest copy$default(DeviceInfoRequest deviceInfoRequest, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z3, float f, String str6, String str7, boolean z4, String str8, String str9, String str10, String str11, int i4, Object obj) {
        String str12;
        String str13;
        String str14 = (i4 & 1) != 0 ? deviceInfoRequest.s0 : str;
        boolean z5 = (i4 & 2) != 0 ? deviceInfoRequest.s1 : z;
        boolean z6 = (i4 & 4) != 0 ? deviceInfoRequest.s2 : z2;
        String str15 = (i4 & 8) != 0 ? deviceInfoRequest.s3 : str2;
        String str16 = (i4 & 16) != 0 ? deviceInfoRequest.s4 : str3;
        String str17 = (i4 & 32) != 0 ? deviceInfoRequest.s6 : str4;
        String str18 = (i4 & 64) != 0 ? deviceInfoRequest.s7 : str5;
        int i5 = (i4 & 128) != 0 ? deviceInfoRequest.s8 : i;
        int i6 = (i4 & 256) != 0 ? deviceInfoRequest.s9 : i2;
        int i7 = (i4 & 512) != 0 ? deviceInfoRequest.s10 : i3;
        boolean z7 = (i4 & 1024) != 0 ? deviceInfoRequest.s12 : z3;
        float f2 = (i4 & 2048) != 0 ? deviceInfoRequest.s13 : f;
        String str19 = (i4 & 4096) != 0 ? deviceInfoRequest.s14 : str6;
        String str20 = (i4 & PKIFailureInfo.certRevoked) != 0 ? deviceInfoRequest.s15 : str7;
        String str21 = str14;
        boolean z8 = (i4 & 16384) != 0 ? deviceInfoRequest.s16 : z4;
        String str22 = (i4 & 32768) != 0 ? deviceInfoRequest.s17 : str8;
        String str23 = (i4 & 65536) != 0 ? deviceInfoRequest.s18 : str9;
        String str24 = (i4 & PKIFailureInfo.unsupportedVersion) != 0 ? deviceInfoRequest.s19 : str10;
        if ((i4 & PKIFailureInfo.transactionIdInUse) != 0) {
            str13 = str24;
            str12 = deviceInfoRequest.s20;
        } else {
            str12 = str11;
            str13 = str24;
        }
        return deviceInfoRequest.copy(str21, z5, z6, str15, str16, str17, str18, i5, i6, i7, z7, f2, str19, str20, z8, str22, str23, str13, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getS0() {
        return this.s0;
    }

    /* renamed from: component10, reason: from getter */
    public final int getS10() {
        return this.s10;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getS12() {
        return this.s12;
    }

    /* renamed from: component12, reason: from getter */
    public final float getS13() {
        return this.s13;
    }

    /* renamed from: component13, reason: from getter */
    public final String getS14() {
        return this.s14;
    }

    /* renamed from: component14, reason: from getter */
    public final String getS15() {
        return this.s15;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getS16() {
        return this.s16;
    }

    /* renamed from: component16, reason: from getter */
    public final String getS17() {
        return this.s17;
    }

    /* renamed from: component17, reason: from getter */
    public final String getS18() {
        return this.s18;
    }

    /* renamed from: component18, reason: from getter */
    public final String getS19() {
        return this.s19;
    }

    /* renamed from: component19, reason: from getter */
    public final String getS20() {
        return this.s20;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getS1() {
        return this.s1;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getS2() {
        return this.s2;
    }

    /* renamed from: component4, reason: from getter */
    public final String getS3() {
        return this.s3;
    }

    /* renamed from: component5, reason: from getter */
    public final String getS4() {
        return this.s4;
    }

    /* renamed from: component6, reason: from getter */
    public final String getS6() {
        return this.s6;
    }

    /* renamed from: component7, reason: from getter */
    public final String getS7() {
        return this.s7;
    }

    /* renamed from: component8, reason: from getter */
    public final int getS8() {
        return this.s8;
    }

    /* renamed from: component9, reason: from getter */
    public final int getS9() {
        return this.s9;
    }

    public final DeviceInfoRequest copy(String s0, boolean s1, boolean s2, String s3, String s4, String s6, String s7, int s8, int s9, int s10, boolean s12, float s13, String s14, String s15, boolean s16, String s17, String s18, String s19, String s20) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(s0, s3, s4, s6, s7);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(s14, s15, s17, s18, s19);
        s20.getClass();
        return new DeviceInfoRequest(s0, s1, s2, s3, s4, s6, s7, s8, s9, s10, s12, s13, s14, s15, s16, s17, s18, s19, s20);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfoRequest)) {
            return false;
        }
        DeviceInfoRequest deviceInfoRequest = (DeviceInfoRequest) other;
        return Intrinsics.areEqual(this.s0, deviceInfoRequest.s0) && this.s1 == deviceInfoRequest.s1 && this.s2 == deviceInfoRequest.s2 && Intrinsics.areEqual(this.s3, deviceInfoRequest.s3) && Intrinsics.areEqual(this.s4, deviceInfoRequest.s4) && Intrinsics.areEqual(this.s6, deviceInfoRequest.s6) && Intrinsics.areEqual(this.s7, deviceInfoRequest.s7) && this.s8 == deviceInfoRequest.s8 && this.s9 == deviceInfoRequest.s9 && this.s10 == deviceInfoRequest.s10 && this.s12 == deviceInfoRequest.s12 && Float.compare(this.s13, deviceInfoRequest.s13) == 0 && Intrinsics.areEqual(this.s14, deviceInfoRequest.s14) && Intrinsics.areEqual(this.s15, deviceInfoRequest.s15) && this.s16 == deviceInfoRequest.s16 && Intrinsics.areEqual(this.s17, deviceInfoRequest.s17) && Intrinsics.areEqual(this.s18, deviceInfoRequest.s18) && Intrinsics.areEqual(this.s19, deviceInfoRequest.s19) && Intrinsics.areEqual(this.s20, deviceInfoRequest.s20);
    }

    public final String getS0() {
        return this.s0;
    }

    public final boolean getS1() {
        return this.s1;
    }

    public final int getS10() {
        return this.s10;
    }

    public final boolean getS12() {
        return this.s12;
    }

    public final float getS13() {
        return this.s13;
    }

    public final String getS14() {
        return this.s14;
    }

    public final String getS15() {
        return this.s15;
    }

    public final boolean getS16() {
        return this.s16;
    }

    public final String getS17() {
        return this.s17;
    }

    public final String getS18() {
        return this.s18;
    }

    public final String getS19() {
        return this.s19;
    }

    public final boolean getS2() {
        return this.s2;
    }

    public final String getS20() {
        return this.s20;
    }

    public final String getS3() {
        return this.s3;
    }

    public final String getS4() {
        return this.s4;
    }

    public final String getS6() {
        return this.s6;
    }

    public final String getS7() {
        return this.s7;
    }

    public final int getS8() {
        return this.s8;
    }

    public final int getS9() {
        return this.s9;
    }

    public int hashCode() {
        return this.s20.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.s13, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.s10, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.s9, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.s8, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.s0.hashCode() * 31, 31, this.s1), 31, this.s2), 31, this.s3), 31, this.s4), 31, this.s6), 31, this.s7), 31), 31), 31), 31, this.s12), 31), 31, this.s14), 31, this.s15), 31, this.s16), 31, this.s17), 31, this.s18), 31, this.s19);
    }

    public String toString() {
        String str = this.s0;
        boolean z = this.s1;
        boolean z2 = this.s2;
        String str2 = this.s3;
        String str3 = this.s4;
        String str4 = this.s6;
        String str5 = this.s7;
        int i = this.s8;
        int i2 = this.s9;
        int i3 = this.s10;
        boolean z3 = this.s12;
        float f = this.s13;
        String str6 = this.s14;
        String str7 = this.s15;
        boolean z4 = this.s16;
        String str8 = this.s17;
        String str9 = this.s18;
        String str10 = this.s19;
        String str11 = this.s20;
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("DeviceInfoRequest(s0=", str, ", s1=", ", s2=", z);
        NavAction$$ExternalSyntheticOutline0.m(m1540m, z2, ", s3=", str2, ", s4=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, str3, ", s6=", str4, ", s7=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, str5, ", s8=", i, ", s9=");
        Recorder$$ExternalSyntheticOutline1.m105m(i2, i3, ", s10=", ", s12=", m1540m);
        m1540m.append(z3);
        m1540m.append(", s13=");
        m1540m.append(f);
        m1540m.append(", s14=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, str6, ", s15=", str7, ", s16=");
        NavAction$$ExternalSyntheticOutline0.m(m1540m, z4, ", s17=", str8, ", s18=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, str9, ", s19=", str10, ", s20=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, str11, ")");
    }
}
