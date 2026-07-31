package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ml {
    public static final b e = new b(null);
    public final String a;
    public final URL b;
    public final String c;
    public final String d;

    public ml(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!StringsKt.equals(CampaignEx.KEY_OMID, builder.b(), true) || TextUtils.isEmpty(builder.c())) {
            throw new InvalidParameterException("ViewabilityVendor cannot be created.");
        }
        this.a = builder.d();
        this.b = new URL(builder.c());
        this.c = builder.f();
        this.d = builder.e();
    }

    public static final class b {
        public final List a(List adVerifications, cj cjVar) {
            String a;
            Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
            ArrayList arrayList = new ArrayList();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                u0 u0Var = (u0) it.next();
                Integer b = ml.e.b(u0Var);
                if (b != null) {
                    int intValue = b.intValue();
                    List b2 = u0Var.b();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : b2) {
                        if (Intrinsics.areEqual(((qi) obj).a(), "verificationNotExecuted")) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String e = ((qi) it2.next()).e();
                        if (e != null) {
                            String replace$default = StringsKt.replace$default(e, "[REASON]", String.valueOf(intValue), false, 4, (Object) null);
                            if (cjVar != null && (a = cjVar.a(replace$default)) != null) {
                                replace$default = a;
                            }
                            arrayList.add(replace$default);
                        }
                    }
                }
            }
            return arrayList;
        }

        public final Set b(List adVerifications, cj cjVar) {
            Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                ml a = ml.e.a((u0) it.next(), cjVar);
                if (a != null) {
                    linkedHashSet.add(a);
                }
            }
            return linkedHashSet;
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer b(u0 u0Var) {
            if (u0Var.a().isEmpty()) {
                return 3;
            }
            List a = a(u0Var);
            if (a.isEmpty()) {
                return 2;
            }
            if (a.isEmpty()) {
                return 3;
            }
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (((nb) it.next()).c() != null) {
                    return null;
                }
            }
            return 3;
        }

        public final ml a(u0 adVerification, cj cjVar) {
            Object obj;
            String c;
            String a;
            Intrinsics.checkNotNullParameter(adVerification, "adVerification");
            Iterator it = a(adVerification).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((nb) obj).c() != null) {
                    break;
                }
            }
            nb nbVar = (nb) obj;
            if (nbVar == null || (c = nbVar.c()) == null) {
                return null;
            }
            if (cjVar != null && (a = cjVar.a(c)) != null) {
                c = a;
            }
            a aVar = new a(c);
            String a2 = nbVar.a();
            if (a2 == null) {
                a2 = "";
            }
            a a3 = aVar.a(a2);
            String c2 = adVerification.c();
            a3.b(c2 != null ? c2 : "").c(adVerification.d());
            return aVar.a();
        }

        public static /* synthetic */ Set a(b bVar, List list, cj cjVar, int i, Object obj) {
            if ((i & 2) != 0) {
                cjVar = null;
            }
            return bVar.b(list, cjVar);
        }

        public final List a(u0 u0Var) {
            List a = u0Var.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a) {
                nb nbVar = (nb) obj;
                if (StringsKt.equals(nbVar.a(), CampaignEx.KEY_OMID, true) && !Intrinsics.areEqual(nbVar.b(), Boolean.FALSE)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public final String b() {
        return this.a;
    }

    public final URL a() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public static final class a {
        public final String a;
        public String b;
        public String c;
        public String d;
        public String e;

        public a(String javascriptResourceUrl) {
            Intrinsics.checkNotNullParameter(javascriptResourceUrl, "javascriptResourceUrl");
            this.a = javascriptResourceUrl;
            this.b = CampaignEx.KEY_OMID;
        }

        public final String c() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final ml a() {
            try {
                return new ml(this);
            } catch (Exception unused) {
                return null;
            }
        }

        public final a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(String str) {
            this.d = str;
            return this;
        }
    }
}
