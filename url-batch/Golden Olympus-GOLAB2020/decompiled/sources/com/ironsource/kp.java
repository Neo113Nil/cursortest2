package com.ironsource;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class kp {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16958a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f16959b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16960c;

    /* renamed from: d, reason: collision with root package name */
    private int f16961d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private int[] f16962e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private int[] f16963f;

    public kp() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public static /* synthetic */ kp a(kp kpVar, boolean z4, String str, boolean z5, int i4, int[] iArr, int[] iArr2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = kpVar.f16958a;
        }
        if ((i5 & 2) != 0) {
            str = kpVar.f16959b;
        }
        if ((i5 & 4) != 0) {
            z5 = kpVar.f16960c;
        }
        if ((i5 & 8) != 0) {
            i4 = kpVar.f16961d;
        }
        if ((i5 & 16) != 0) {
            iArr = kpVar.f16962e;
        }
        if ((i5 & 32) != 0) {
            iArr2 = kpVar.f16963f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return kpVar.a(z4, str, z5, i4, iArr3, iArr4);
    }

    @NotNull
    public final String b() {
        return this.f16959b;
    }

    public final boolean c() {
        return this.f16960c;
    }

    public final int d() {
        return this.f16961d;
    }

    @Nullable
    public final int[] e() {
        return this.f16962e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        return this.f16958a == kpVar.f16958a && Intrinsics.areEqual(this.f16959b, kpVar.f16959b) && this.f16960c == kpVar.f16960c && this.f16961d == kpVar.f16961d && Intrinsics.areEqual(this.f16962e, kpVar.f16962e) && Intrinsics.areEqual(this.f16963f, kpVar.f16963f);
    }

    @Nullable
    public final int[] f() {
        return this.f16963f;
    }

    public final boolean g() {
        return this.f16960c;
    }

    public final int h() {
        return this.f16961d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z4 = this.f16958a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + this.f16959b.hashCode()) * 31;
        boolean z5 = this.f16960c;
        int hashCode2 = (((hashCode + (z5 ? 1 : z5 ? 1 : 0)) * 31) + Integer.hashCode(this.f16961d)) * 31;
        int[] iArr = this.f16962e;
        int hashCode3 = (hashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f16963f;
        return hashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f16958a;
    }

    @NotNull
    public final String j() {
        return this.f16959b;
    }

    @Nullable
    public final int[] k() {
        return this.f16963f;
    }

    @Nullable
    public final int[] l() {
        return this.f16962e;
    }

    @NotNull
    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f16958a + ", pixelEventsUrl=" + this.f16959b + ", pixelEventsCompression=" + this.f16960c + ", pixelEventsCompressionLevel=" + this.f16961d + ", pixelOptOut=" + Arrays.toString(this.f16962e) + ", pixelOptIn=" + Arrays.toString(this.f16963f) + ')';
    }

    public kp(boolean z4, @NotNull String pixelEventsUrl, boolean z5, int i4, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f16958a = z4;
        this.f16959b = pixelEventsUrl;
        this.f16960c = z5;
        this.f16961d = i4;
        this.f16962e = iArr;
        this.f16963f = iArr2;
    }

    @NotNull
    public final kp a(boolean z4, @NotNull String pixelEventsUrl, boolean z5, int i4, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new kp(z4, pixelEventsUrl, z5, i4, iArr, iArr2);
    }

    public final void b(boolean z4) {
        this.f16958a = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ kp(boolean r2, java.lang.String r3, boolean r4, int r5, int[] r6, int[] r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.String r3 = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=3"
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = 0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = -1
        L15:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.kp.<init>(boolean, java.lang.String, boolean, int, int[], int[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final void a(int i4) {
        this.f16961d = i4;
    }

    public final void b(@Nullable int[] iArr) {
        this.f16962e = iArr;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f16959b = str;
    }

    public final void a(boolean z4) {
        this.f16960c = z4;
    }

    public final void a(@Nullable int[] iArr) {
        this.f16963f = iArr;
    }

    public final boolean a() {
        return this.f16958a;
    }
}
