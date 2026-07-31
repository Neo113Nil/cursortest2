package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.f52;
import com.yandex.mobile.ads.impl.yn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class er {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final er f25391e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final er f25392f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25393a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25394b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String[] f25395c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String[] f25396d;

    static {
        yn ynVar = yn.f35262r;
        yn ynVar2 = yn.f35263s;
        yn ynVar3 = yn.f35264t;
        yn ynVar4 = yn.f35256l;
        yn ynVar5 = yn.f35258n;
        yn ynVar6 = yn.f35257m;
        yn ynVar7 = yn.f35259o;
        yn ynVar8 = yn.f35261q;
        yn ynVar9 = yn.f35260p;
        yn[] ynVarArr = {ynVar, ynVar2, ynVar3, ynVar4, ynVar5, ynVar6, ynVar7, ynVar8, ynVar9};
        yn[] ynVarArr2 = {ynVar, ynVar2, ynVar3, ynVar4, ynVar5, ynVar6, ynVar7, ynVar8, ynVar9, yn.f35254j, yn.f35255k, yn.f35252h, yn.f35253i, yn.f35250f, yn.f35251g, yn.f35249e};
        a a4 = new a(true).a((yn[]) Arrays.copyOf(ynVarArr, 9));
        f52 f52Var = f52.f25628d;
        f52 f52Var2 = f52.f25629e;
        a4.a(f52Var, f52Var2).b().a();
        f25391e = new a(true).a((yn[]) Arrays.copyOf(ynVarArr2, 16)).a(f52Var, f52Var2).b().a();
        new a(true).a((yn[]) Arrays.copyOf(ynVarArr2, 16)).a(f52Var, f52Var2, f52.f25630f, f52.f25631g).b().a();
        f25392f = new a(false).a();
    }

    public er(boolean z4, boolean z5, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f25393a = z4;
        this.f25394b = z5;
        this.f25395c = strArr;
        this.f25396d = strArr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof er)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z4 = this.f25393a;
        er erVar = (er) obj;
        if (z4 != erVar.f25393a) {
            return false;
        }
        return !z4 || (Arrays.equals(this.f25395c, erVar.f25395c) && Arrays.equals(this.f25396d, erVar.f25396d) && this.f25394b == erVar.f25394b);
    }

    public final int hashCode() {
        if (!this.f25393a) {
            return 17;
        }
        String[] strArr = this.f25395c;
        int hashCode = ((strArr != null ? Arrays.hashCode(strArr) : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String[] strArr2 = this.f25396d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f25394b ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        List list;
        if (!this.f25393a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f25395c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(yn.f35246b.a(str));
            }
            list = CollectionsKt.toList(arrayList);
        } else {
            list = null;
        }
        String objects = Objects.toString(list, "[all enabled]");
        String[] strArr2 = this.f25396d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                f52.f25627c.getClass();
                arrayList2.add(f52.a.a(str2));
            }
            list2 = CollectionsKt.toList(arrayList2);
        }
        return "ConnectionSpec(cipherSuites=" + objects + ", tlsVersions=" + Objects.toString(list2, "[all enabled]") + ", supportsTlsExtensions=" + this.f25394b + ")";
    }

    public final void a(@NotNull SSLSocket sslSocket, boolean z4) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        yn.a comparator;
        List list;
        yn.a aVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f25395c != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites2, "getEnabledCipherSuites(...)");
            String[] strArr = this.f25395c;
            aVar = yn.f35247c;
            enabledCipherSuites = v82.b(enabledCipherSuites2, strArr, aVar);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        if (this.f25396d != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = v82.b(enabledProtocols2, this.f25396d, (Comparator<? super String>) Z1.a.g());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNull(supportedCipherSuites);
        comparator = yn.f35247c;
        byte[] bArr = v82.f33550a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (z4 && i4 != -1) {
            Intrinsics.checkNotNull(enabledCipherSuites);
            String value = supportedCipherSuites[i4];
            Intrinsics.checkNotNullExpressionValue(value, "get(...)");
            Intrinsics.checkNotNullParameter(enabledCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[AbstractC3219i.M(enabledCipherSuites)] = value;
        }
        a aVar2 = new a(this);
        Intrinsics.checkNotNull(enabledCipherSuites);
        a a4 = aVar2.a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Intrinsics.checkNotNull(enabledProtocols);
        er a5 = a4.b((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
        String[] strArr2 = a5.f25396d;
        List list2 = null;
        if (strArr2 != null) {
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                f52.f25627c.getClass();
                arrayList.add(f52.a.a(str));
            }
            list = CollectionsKt.toList(arrayList);
        } else {
            list = null;
        }
        if (list != null) {
            sslSocket.setEnabledProtocols(a5.f25396d);
        }
        String[] strArr3 = a5.f25395c;
        if (strArr3 != null) {
            ArrayList arrayList2 = new ArrayList(strArr3.length);
            for (String str2 : strArr3) {
                arrayList2.add(yn.f35246b.a(str2));
            }
            list2 = CollectionsKt.toList(arrayList2);
        }
        if (list2 != null) {
            sslSocket.setEnabledCipherSuites(a5.f25395c);
        }
    }

    public final boolean b() {
        return this.f25394b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f25397a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String[] f25398b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String[] f25399c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f25400d;

        public a(@NotNull er connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f25397a = connectionSpec.a();
            this.f25398b = connectionSpec.f25395c;
            this.f25399c = connectionSpec.f25396d;
            this.f25400d = connectionSpec.b();
        }

        @NotNull
        public final a a(@NotNull yn... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f25397a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (yn ynVar : cipherSuites) {
                arrayList.add(ynVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final a b() {
            if (!this.f25397a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f25400d = true;
            return this;
        }

        @NotNull
        public final a b(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f25397a) {
                if (!(tlsVersions.length == 0)) {
                    this.f25399c = (String[]) tlsVersions.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public a(boolean z4) {
            this.f25397a = z4;
        }

        @NotNull
        public final a a(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f25397a) {
                if (!(cipherSuites.length == 0)) {
                    this.f25398b = (String[]) cipherSuites.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        @NotNull
        public final a a(@NotNull f52... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f25397a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (f52 f52Var : tlsVersions) {
                    arrayList.add(f52Var.a());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        @NotNull
        public final er a() {
            return new er(this.f25397a, this.f25400d, this.f25398b, this.f25399c);
        }
    }

    public final boolean a(@NotNull SSLSocket socket) {
        yn.a aVar;
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f25393a) {
            return false;
        }
        String[] strArr = this.f25396d;
        if (strArr != null && !v82.a(strArr, socket.getEnabledProtocols(), (Comparator<? super String>) Z1.a.g())) {
            return false;
        }
        String[] strArr2 = this.f25395c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        aVar = yn.f35247c;
        return v82.a(strArr2, enabledCipherSuites, aVar);
    }

    public final boolean a() {
        return this.f25393a;
    }
}
