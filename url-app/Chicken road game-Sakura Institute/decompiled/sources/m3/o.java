package m3;

import A.AbstractC0017m;
import A.C0005a;
import A.C0016l;
import D.C0120c;
import D.C0147l;
import D.x1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0219q0;
import G.C0222s0;
import G.C0235z;
import M2.C0256h;
import M2.F;
import Z.AbstractC0319p;
import Z.C0310g;
import Z.C0320q;
import Z.C0323u;
import Z.K;
import Z.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0470j;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import b2.C0518b;
import d2.C0545b;
import e0.AbstractC0557b;
import e0.C0556a;
import f0.AbstractC0576G;
import f0.AbstractC0581b;
import f0.C0575F;
import f0.C0578I;
import f0.C0579J;
import f0.C0583d;
import f0.C0584e;
import g0.AbstractC0637b;
import g0.C0636a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.t0;
import n.AbstractC0864b;
import o1.AbstractC0921b;
import o2.C0922a;
import o2.C0924c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.xmlpull.v1.XmlPullParserException;
import p1.C0991a;
import q.AbstractC1024c;
import s1.C1193i;
import s1.D;
import s1.E;
import t1.C1203a;
import w0.C1286a;
import w0.C1287b;
import w0.C1288c;
import w0.C1289d;
import w2.C1294c;
import z1.C1361E;
import z1.C1362F;
import z1.C1364H;
import z1.C1372P;
import z1.C1374S;
import z1.C1377c;
import z1.C1379e;
import z1.C1381g;
import z1.C1389o;
import z1.C1391q;
import z1.C1393s;
import z1.EnumC1375a;
import z1.EnumC1387m;
import z1.EnumC1388n;
import z2.C1405I;

/* loaded from: classes.dex */
public abstract class o {
    public static final void a(S2.c cVar, S.o oVar, s.z zVar, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(2002163445);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(cVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(zVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(function2) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            u.b(O.f.b(-1488997347, new androidx.compose.foundation.lazy.layout.b(zVar, oVar, function2, C0192d.N(cVar, c0216p)), c0216p), c0216p, 6);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0147l(cVar, oVar, zVar, function2, i2, 3);
        }
    }

    public static final void b(C1193i viewModelStoreOwner, P.i iVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1579360880);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(viewModelStoreOwner) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(iVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            C0235z c0235z = q1.b.f9362a;
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
            C0192d.b(new C0219q0[]{q1.b.f9362a.a(viewModelStoreOwner), AbstractC0921b.f8914a.a(viewModelStoreOwner), AndroidCompositionLocals_androidKt.f5216e.a(viewModelStoreOwner)}, O.f.b(-52928304, new C0120c(iVar, 14, aVar), c0216p), c0216p, 56);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(viewModelStoreOwner, iVar, aVar, i2, 8);
        }
    }

    public static o2.s c(Object obj, o2.s sVar) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    sVar = s.o(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return o2.k.f8939k;
            }
            if (obj instanceof String) {
                return new o2.v((String) obj, sVar);
            }
            if (obj instanceof Long) {
                return new o2.p((Long) obj, sVar);
            }
            if (obj instanceof Integer) {
                return new o2.p(Long.valueOf(((Integer) obj).intValue()), sVar);
            }
            if (obj instanceof Double) {
                return new o2.j((Double) obj, sVar);
            }
            if (obj instanceof Boolean) {
                return new C0922a((Boolean) obj, sVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new C0518b("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new o2.i(map2, sVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        o2.s c4 = c(map2.get(str), o2.k.f8939k);
                        if (!c4.isEmpty()) {
                            hashMap.put(C0924c.c(str), c4);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String str2 = "" + i2;
                    o2.s c5 = c(list.get(i2), o2.k.f8939k);
                    if (!c5.isEmpty()) {
                        hashMap.put(C0924c.c(str2), c5);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return o2.k.f8939k;
            }
            A3.i iVar = o2.f.f8924j;
            return new o2.f(hashMap.size() < 25 ? C0545b.F(new ArrayList(hashMap.keySet()), hashMap, iVar) : Y0.b.h(new ArrayList(hashMap.keySet()), hashMap, iVar), sVar);
        } catch (ClassCastException e4) {
            throw new C0518b("Failed to parse node", e4);
        }
    }

    public static final void d(P.i iVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        C1294c c1294c;
        c0216p.U(1211832233);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(iVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.T(1729797275);
            Z owner = q1.b.a(c0216p);
            if (owner == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            boolean z4 = owner instanceof InterfaceC0470j;
            t0 extras = z4 ? ((InterfaceC0470j) owner).a() : C0991a.f9082b;
            C0256h modelClass = F.a(C1203a.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            c0216p.T(1673618944);
            Intrinsics.checkNotNullParameter(owner, "<this>");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (z4) {
                Y store = owner.d();
                V factory = ((InterfaceC0470j) owner).f();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(extras, "extras");
                c1294c = new C1294c(store, factory, extras);
            } else {
                Intrinsics.checkNotNullParameter(owner, "owner");
                V factory2 = z4 ? ((InterfaceC0470j) owner).f() : r1.a.f9856a;
                Intrinsics.checkNotNullParameter(owner, "owner");
                t0 extras2 = z4 ? ((InterfaceC0470j) owner).a() : C0991a.f9082b;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(extras2, "extras");
                c1294c = new C1294c(owner.d(), factory2, extras2);
            }
            T e4 = c1294c.e(modelClass);
            c0216p.q(false);
            c0216p.q(false);
            C1203a c1203a = (C1203a) e4;
            c1203a.f10644d = new WeakReference(iVar);
            iVar.d(c1203a.f10643c, aVar, c0216p, ((i4 << 6) & 896) | (i4 & 112));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(iVar, aVar, i2, 11);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object e(l0.C0800A r8, E2.a r9) {
        /*
            boolean r0 = r9 instanceof n.d
            if (r0 == 0) goto L13
            r0 = r9
            n.d r0 = (n.d) r0
            int r1 = r0.f8508l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8508l = r1
            goto L18
        L13:
            n.d r0 = new n.d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8507k
            D2.a r1 = D2.a.f2163d
            int r2 = r0.f8508l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            l0.A r8 = r0.f8506j
            y2.AbstractC1343r.b(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            y2.AbstractC1343r.b(r9)
        L34:
            r0.f8506j = r8
            r0.f8508l = r3
            l0.j r9 = l0.EnumC0812j.f7911e
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L6e
        L41:
            l0.i r9 = (l0.C0811i) r9
            int r2 = r9.f7908b
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.f7907a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            l0.s r6 = (l0.s) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f7930h
            if (r7 != 0) goto L34
            boolean r6 = r6.f7926d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r1 = r9.get(r4)
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.o.e(l0.A, E2.a):java.lang.Object");
    }

    public static final C1377c f(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i2 = jSONObject.getInt("bib");
        String string3 = jSONObject.getString("team");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        int i4 = jSONObject.getInt("birthYear");
        boolean optBoolean = jSONObject.optBoolean("female");
        String optString = jSONObject.optString("bio");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return new C1377c(string, string2, i2, string3, i4, optBoolean, optString);
    }

    public static final C1379e g(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("athleteId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("discipline");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = jSONObject.getString("date");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return new C1379e(string, string2, string3, string4, string5);
    }

    public static final C1381g h(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("tournamentId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("kind");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        EnumC1387m valueOf = EnumC1387m.valueOf(string3);
        Integer valueOf2 = jSONObject.isNull("distanceM") ? null : Integer.valueOf(jSONObject.getInt("distanceM"));
        String string4 = jSONObject.getString("ageGroup");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        EnumC1375a valueOf3 = EnumC1375a.valueOf(string4);
        boolean optBoolean = jSONObject.optBoolean("female");
        String optString = jSONObject.optString("startTime");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return new C1381g(string, string2, valueOf, valueOf2, valueOf3, optBoolean, optString);
    }

    public static final C1391q i(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("eventId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String optString = jSONObject.optString("wind");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        C1391q c1391q = new C1391q(string, string2, optString, 4);
        JSONArray optJSONArray = jSONObject.optJSONArray("rows");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                String string3 = jSONObject2.getString("athleteId");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                C1389o c1389o = new C1389o(string3);
                JSONArray jSONArray = jSONObject2.getJSONArray("attempts");
                c1389o.f11902b.clear();
                int length2 = jSONArray.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    c1389o.f11902b.add(jSONArray.isNull(i4) ? null : Double.valueOf(jSONArray.getDouble(i4)));
                }
                c1391q.f11905c.add(c1389o);
            }
        }
        return c1391q;
    }

    public static final C1393s j(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("eventId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C1393s c1393s = new C1393s(jSONObject.getInt("heatNo"), string, string2);
        JSONObject optJSONObject = jSONObject.optJSONObject("lanes");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Map map = c1393s.f11910d;
                Intrinsics.c(next);
                map.put(Integer.valueOf(Integer.parseInt(next)), optJSONObject.getString(next));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("times");
        if (optJSONObject2 != null) {
            Iterator<String> keys2 = optJSONObject2.keys();
            Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                Map map2 = c1393s.f11911e;
                Intrinsics.c(next2);
                map2.put(Integer.valueOf(Integer.parseInt(next2)), Long.valueOf(optJSONObject2.getLong(next2)));
            }
        }
        return c1393s;
    }

    public static final C1361E k(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("label");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("holder");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = jSONObject.getString("team");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = jSONObject.getString("date");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        String optString = jSONObject.optString("scope", "Village");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return new C1361E(string, string2, string3, string4, string5, string6, optString);
    }

    public static final C1364H l(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("tournamentId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String optString = jSONObject.optString("event", "4x100m");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        C1364H c1364h = new C1364H(string, string2, string3, optString, new ArrayList());
        JSONArray jSONArray = jSONObject.getJSONArray("legs");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            c1364h.f11799e.add(new C1362F(jSONObject2.getInt("order"), jSONObject2.isNull("athleteId") ? null : jSONObject2.getString("athleteId")));
        }
        return c1364h;
    }

    public static final C1372P m(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("date");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = jSONObject.getString("village");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = jSONObject.getString("level");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        EnumC1388n valueOf = EnumC1388n.valueOf(string5);
        String optString = jSONObject.optString("note");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return new C1372P(string, string2, string3, string4, valueOf, optString);
    }

    public static final C1374S n(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.isNull("athleteId") ? null : jSONObject.getString("athleteId");
        String string3 = jSONObject.getString("date");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        double d4 = jSONObject.getDouble("distanceKm");
        int i2 = jSONObject.getInt("durationSec");
        String optString = jSONObject.optString("notes");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return new C1374S(string, string2, string3, d4, i2, optString);
    }

    public static final boolean o(Y.d dVar, float f4, float f5) {
        return f4 <= dVar.f4376c && dVar.f4374a <= f4 && f5 <= dVar.f4377d && dVar.f4375b <= f5;
    }

    public static p p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = p.f8402c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(group.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = p.f8403d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC0017m.m(sb, str, '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (kotlin.text.u.n(group4, "'") && kotlin.text.u.h(false, group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new p(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final E q(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        s1.F f4 = new s1.F();
        optionsBuilder.invoke(f4);
        boolean z4 = f4.f10479b;
        D d4 = f4.f10478a;
        d4.f10462a = z4;
        d4.f10463b = f4.f10480c;
        String str = f4.f10482e;
        if (str != null) {
            boolean z5 = f4.f10483f;
            d4.f10465d = str;
            d4.f10464c = -1;
            d4.f10466e = false;
            d4.f10467f = z5;
        } else {
            int i2 = f4.f10481d;
            boolean z6 = f4.f10483f;
            d4.f10464c = i2;
            d4.f10465d = null;
            d4.f10466e = false;
            d4.f10467f = z6;
        }
        String str2 = d4.f10465d;
        if (str2 == null) {
            return new E(d4.f10462a, d4.f10463b, d4.f10464c, d4.f10466e, d4.f10467f, d4.f10468g, d4.f10469h);
        }
        boolean z7 = d4.f10462a;
        boolean z8 = d4.f10463b;
        boolean z9 = d4.f10466e;
        boolean z10 = d4.f10467f;
        int i4 = d4.f10468g;
        int i5 = d4.f10469h;
        int i6 = s1.v.f10569n;
        E e4 = new E(z7, z8, AbstractC0864b.o(str2).hashCode(), z9, z10, i4, i5);
        e4.f10477h = str2;
        return e4;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC0557b r(int i2, C0216p c0216p) {
        TypedValue typedValue;
        long j4;
        int i4;
        C0584e c0584e;
        int eventType;
        int i5;
        C1288c c1288c;
        C1287b c1287b;
        XmlResourceParser xmlResourceParser;
        C0584e c0584e2;
        Resources resources;
        char c4;
        int i6;
        TypedArray obtainStyledAttributes;
        int i7;
        TypedArray obtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        TypedArray obtainStyledAttributes3;
        ColorStateList colorStateList;
        int i11 = 1;
        Context context = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
        c0216p.k(AndroidCompositionLocals_androidKt.f5212a);
        Resources resources2 = context.getResources();
        C1289d c1289d = (C1289d) c0216p.k(AndroidCompositionLocals_androidKt.f5215d);
        synchronized (c1289d) {
            typedValue = (TypedValue) c1289d.f11377a.f(i2);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources2.getValue(i2, typedValue, true);
                i.q qVar = c1289d.f11377a;
                int d4 = qVar.d(i2);
                Object[] objArr = qVar.f6942c;
                Object obj = objArr[d4];
                qVar.f6941b[d4] = i2;
                objArr[d4] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !kotlin.text.y.q(charSequence, ".xml")) {
            c0216p.S(-802884675);
            boolean f4 = c0216p.f(context.getTheme()) | c0216p.f(charSequence) | c0216p.d(i2);
            Object I3 = c0216p.I();
            if (f4 || I3 == C0208l.f2826a) {
                try {
                    Drawable drawable = resources2.getDrawable(i2, null);
                    Intrinsics.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    I3 = new C0310g(((BitmapDrawable) drawable).getBitmap());
                    c0216p.c0(I3);
                } catch (Exception e4) {
                    throw new I1.b("Error attempting to load resource: " + ((Object) charSequence), e4);
                }
            }
            C0556a c0556a = new C0556a((C0310g) I3);
            c0216p.q(false);
            return c0556a;
        }
        c0216p.S(-803040357);
        Resources.Theme theme = context.getTheme();
        int i12 = typedValue.changingConfigurations;
        C1288c c1288c2 = (C1288c) c0216p.k(AndroidCompositionLocals_androidKt.f5214c);
        C1287b c1287b2 = new C1287b(theme, i2);
        WeakReference weakReference = (WeakReference) c1288c2.f11376a.get(c1287b2);
        C1286a c1286a = weakReference != null ? (C1286a) weakReference.get() : null;
        if (c1286a == null) {
            XmlResourceParser xml = resources2.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            C0636a c0636a = new C0636a(xml);
            int[] iArr = AbstractC0637b.f6672a;
            TypedArray obtainAttributes = theme == null ? resources2.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            c0636a.c(obtainAttributes.getChangingConfigurations());
            boolean z4 = !U0.b.a(xml, "autoMirrored") ? false : obtainAttributes.getBoolean(5, false);
            c0636a.c(obtainAttributes.getChangingConfigurations());
            float b4 = c0636a.b(obtainAttributes, "viewportWidth", 7, 0.0f);
            float b5 = c0636a.b(obtainAttributes, "viewportHeight", 8, 0.0f);
            if (b4 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b5 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = obtainAttributes.getDimension(3, 0.0f);
            c0636a.c(obtainAttributes.getChangingConfigurations());
            float dimension2 = obtainAttributes.getDimension(2, 0.0f);
            c0636a.c(obtainAttributes.getChangingConfigurations());
            if (obtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                obtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j4 = C0323u.f4547g;
                } else {
                    if (U0.b.a(xml, "tint")) {
                        TypedValue typedValue3 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue3);
                        int i13 = typedValue3.type;
                        if (i13 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i13 < 28 || i13 > 31) {
                            Resources resources3 = obtainAttributes.getResources();
                            int resourceId = obtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = U0.c.f4092a;
                            try {
                                colorStateList = U0.c.a(resources3, resources3.getXml(resourceId), theme);
                            } catch (Exception e5) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        c0636a.c(obtainAttributes.getChangingConfigurations());
                        j4 = colorStateList == null ? K.c(colorStateList.getDefaultColor()) : C0323u.f4547g;
                    }
                    colorStateList = null;
                    c0636a.c(obtainAttributes.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j4 = C0323u.f4547g;
            }
            long j5 = j4;
            int i14 = obtainAttributes.getInt(6, -1);
            c0636a.c(obtainAttributes.getChangingConfigurations());
            if (i14 != -1) {
                if (i14 == 3) {
                    i4 = 3;
                } else if (i14 != 5) {
                    if (i14 != 9) {
                        switch (i14) {
                            case 14:
                                i4 = 13;
                                break;
                            case AbstractC1024c.f9246g /* 15 */:
                                i4 = 14;
                                break;
                            case 16:
                                i4 = 12;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                }
                float f5 = dimension / resources2.getDisplayMetrics().density;
                float f6 = dimension2 / resources2.getDisplayMetrics().density;
                obtainAttributes.recycle();
                c0584e = new C0584e(null, f5, f6, b4, b5, j5, i4, z4, 1);
                int i15 = 0;
                for (int i16 = 3; xml.getEventType() != i11 && (xml.getDepth() >= i11 || xml.getEventType() != i16); i16 = 3) {
                    XmlResourceParser xmlResourceParser2 = c0636a.f6669a;
                    eventType = xmlResourceParser2.getEventType();
                    if (eventType == 2) {
                        if (eventType != i16) {
                            resources = resources2;
                            i5 = i12;
                            c1288c = c1288c2;
                            c1287b = c1287b2;
                            xmlResourceParser = xml;
                        } else if ("group".equals(xmlResourceParser2.getName())) {
                            i11 = 1;
                            int i17 = i15 + 1;
                            int i18 = 0;
                            while (i18 < i17) {
                                if (c0584e.f6372k) {
                                    AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                ArrayList arrayList = c0584e.f6370i;
                                C0583d c0583d = (C0583d) arrayList.remove(arrayList.size() - i11);
                                ((C0583d) arrayList.get(arrayList.size() - 1)).f6361j.add(new C0575F(c0583d.f6352a, c0583d.f6353b, c0583d.f6354c, c0583d.f6355d, c0583d.f6356e, c0583d.f6357f, c0583d.f6358g, c0583d.f6359h, c0583d.f6360i, c0583d.f6361j));
                                i18++;
                                i11 = 1;
                                i17 = i17;
                                c1287b2 = c1287b2;
                                c1288c2 = c1288c2;
                                i12 = i12;
                                xml = xml;
                                c0584e = c0584e;
                                resources2 = resources2;
                            }
                            i5 = i12;
                            c1288c = c1288c2;
                            c1287b = c1287b2;
                            xmlResourceParser = xml;
                            resources = resources2;
                            c0584e2 = c0584e;
                            i15 = 0;
                            c4 = '\t';
                            xmlResourceParser.next();
                            resources2 = resources;
                            c0584e = c0584e2;
                            c1287b2 = c1287b;
                            c1288c2 = c1288c;
                            i12 = i5;
                            xml = xmlResourceParser;
                        } else {
                            i5 = i12;
                            c1288c = c1288c2;
                            c1287b = c1287b2;
                            xmlResourceParser = xml;
                            resources = resources2;
                        }
                        c0584e2 = c0584e;
                    } else {
                        Resources resources4 = resources2;
                        i5 = i12;
                        c1288c = c1288c2;
                        c1287b = c1287b2;
                        xmlResourceParser = xml;
                        C0584e c0584e3 = c0584e;
                        String name = xmlResourceParser2.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            C1294c c1294c = c0636a.f6671c;
                            if (hashCode == -1649314686) {
                                c0584e2 = c0584e3;
                                resources = resources4;
                                c4 = '\t';
                                if (name.equals("clip-path")) {
                                    int[] iArr2 = AbstractC0637b.f6675d;
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                                        i6 = 0;
                                    } else {
                                        i6 = 0;
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                    }
                                    c0636a.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string = obtainStyledAttributes.getString(i6);
                                    c0636a.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    String string2 = obtainStyledAttributes.getString(1);
                                    c0636a.c(obtainStyledAttributes.getChangingConfigurations());
                                    List j6 = string2 == null ? AbstractC0576G.f6305a : C1294c.j(c1294c, string2);
                                    obtainStyledAttributes.recycle();
                                    if (c0584e2.f6372k) {
                                        AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    c0584e2.f6370i.add(new C0583d(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, j6, 512));
                                    i11 = 1;
                                    i15++;
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    c0584e = c0584e2;
                                    c1287b2 = c1287b;
                                    c1288c2 = c1288c;
                                    i12 = i5;
                                    xml = xmlResourceParser;
                                }
                            } else if (hashCode == 3433509) {
                                c0584e2 = c0584e3;
                                resources = resources4;
                                if (name.equals("path")) {
                                    int[] iArr3 = AbstractC0637b.f6674c;
                                    if (theme == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i7 = 0;
                                    } else {
                                        i7 = 0;
                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (!U0.b.a(xmlResourceParser2, "pathData")) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String string3 = obtainStyledAttributes2.getString(i7);
                                    c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string3 == null ? "" : string3;
                                    String string4 = obtainStyledAttributes2.getString(2);
                                    c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    List j7 = string4 == null ? AbstractC0576G.f6305a : C1294c.j(c1294c, string4);
                                    G1.y a4 = c0636a.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                    float b6 = c0636a.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i19 = !U0.b.a(c0636a.f6669a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i19 != 0) {
                                        if (i19 != 1) {
                                            i8 = 2;
                                            if (i19 == 2) {
                                                i9 = 2;
                                            }
                                        } else {
                                            i8 = 2;
                                            i9 = 1;
                                        }
                                        if (U0.b.a(c0636a.f6669a, "strokeLineJoin")) {
                                            i10 = -1;
                                            c4 = '\t';
                                        } else {
                                            c4 = '\t';
                                            i10 = obtainStyledAttributes2.getInt(9, -1);
                                        }
                                        c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                        int i20 = i10 == 0 ? i10 != 1 ? i8 : 1 : 0;
                                        float b7 = c0636a.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                        G1.y a5 = c0636a.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                        float b8 = c0636a.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b9 = c0636a.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b10 = c0636a.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b11 = c0636a.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b12 = c0636a.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        int i21 = U0.b.a(c0636a.f6669a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                        c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        int i22 = a4.f3164a;
                                        Shader shader = (Shader) a4.f3165b;
                                        AbstractC0319p c0320q = (shader == null && i22 == 0) ? null : shader == null ? new C0320q(shader) : new S(K.c(i22));
                                        int i23 = a5.f3164a;
                                        Shader shader2 = (Shader) a5.f3165b;
                                        AbstractC0319p c0320q2 = (shader2 == null && i23 == 0) ? null : shader2 != null ? new C0320q(shader2) : new S(K.c(i23));
                                        int i24 = i21 != 0 ? 0 : 1;
                                        if (!c0584e2.f6372k) {
                                            AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            throw null;
                                        }
                                        ArrayList arrayList2 = c0584e2.f6370i;
                                        ((C0583d) arrayList2.get(arrayList2.size() - 1)).f6361j.add(new C0579J(str2, j7, i24, c0320q, b6, c0320q2, b8, b9, i9, i20, b7, b12, b10, b11));
                                    } else {
                                        i8 = 2;
                                    }
                                    i9 = 0;
                                    if (U0.b.a(c0636a.f6669a, "strokeLineJoin")) {
                                    }
                                    c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i10 == 0) {
                                    }
                                    float b72 = c0636a.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                    G1.y a52 = c0636a.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                    float b82 = c0636a.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b92 = c0636a.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b102 = c0636a.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b112 = c0636a.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b122 = c0636a.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (U0.b.a(c0636a.f6669a, "fillType")) {
                                    }
                                    c0636a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    int i222 = a4.f3164a;
                                    Shader shader3 = (Shader) a4.f3165b;
                                    if (shader3 == null) {
                                        int i232 = a52.f3164a;
                                        Shader shader22 = (Shader) a52.f3165b;
                                        if (shader22 == null) {
                                            if (i21 != 0) {
                                            }
                                            if (!c0584e2.f6372k) {
                                            }
                                        }
                                        if (i21 != 0) {
                                        }
                                        if (!c0584e2.f6372k) {
                                        }
                                    }
                                    int i2322 = a52.f3164a;
                                    Shader shader222 = (Shader) a52.f3165b;
                                    if (shader222 == null) {
                                    }
                                    if (i21 != 0) {
                                    }
                                    if (!c0584e2.f6372k) {
                                    }
                                }
                            } else if (hashCode == 98629247 && name.equals("group")) {
                                int[] iArr4 = AbstractC0637b.f6673b;
                                if (theme == null) {
                                    resources = resources4;
                                    obtainStyledAttributes3 = resources.obtainAttributes(asAttributeSet, iArr4);
                                } else {
                                    resources = resources4;
                                    obtainStyledAttributes3 = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                }
                                c0636a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float b13 = c0636a.b(obtainStyledAttributes3, "rotation", 5, 0.0f);
                                float f7 = obtainStyledAttributes3.getFloat(1, 0.0f);
                                c0636a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float f8 = obtainStyledAttributes3.getFloat(2, 0.0f);
                                c0636a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float b14 = c0636a.b(obtainStyledAttributes3, "scaleX", 3, 1.0f);
                                float b15 = c0636a.b(obtainStyledAttributes3, "scaleY", 4, 1.0f);
                                float b16 = c0636a.b(obtainStyledAttributes3, "translateX", 6, 0.0f);
                                float b17 = c0636a.b(obtainStyledAttributes3, "translateY", 7, 0.0f);
                                String string5 = obtainStyledAttributes3.getString(0);
                                c0636a.c(obtainStyledAttributes3.getChangingConfigurations());
                                String str3 = string5 == null ? "" : string5;
                                obtainStyledAttributes3.recycle();
                                C1405I c1405i = AbstractC0576G.f6305a;
                                c0584e2 = c0584e3;
                                if (c0584e2.f6372k) {
                                    AbstractC0864b.D("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                c0584e2.f6370i.add(new C0583d(str3, b13, f7, f8, b14, b15, b16, b17, c1405i, 512));
                            }
                            i11 = 1;
                            xmlResourceParser.next();
                            resources2 = resources;
                            c0584e = c0584e2;
                            c1287b2 = c1287b;
                            c1288c2 = c1288c;
                            i12 = i5;
                            xml = xmlResourceParser;
                        }
                        c0584e2 = c0584e3;
                        resources = resources4;
                    }
                    i11 = 1;
                    c4 = '\t';
                    xmlResourceParser.next();
                    resources2 = resources;
                    c0584e = c0584e2;
                    c1287b2 = c1287b;
                    c1288c2 = c1288c;
                    i12 = i5;
                    xml = xmlResourceParser;
                }
                C1288c c1288c3 = c1288c2;
                C1287b c1287b3 = c1287b2;
                c1286a = new C1286a(c0584e.b(), i12);
                c1288c3.f11376a.put(c1287b3, new WeakReference(c1286a));
            }
            i4 = 5;
            float f52 = dimension / resources2.getDisplayMetrics().density;
            float f62 = dimension2 / resources2.getDisplayMetrics().density;
            obtainAttributes.recycle();
            c0584e = new C0584e(null, f52, f62, b4, b5, j5, i4, z4, 1);
            int i152 = 0;
            while (xml.getEventType() != i11) {
                XmlResourceParser xmlResourceParser22 = c0636a.f6669a;
                eventType = xmlResourceParser22.getEventType();
                if (eventType == 2) {
                }
                i11 = 1;
                c4 = '\t';
                xmlResourceParser.next();
                resources2 = resources;
                c0584e = c0584e2;
                c1287b2 = c1287b;
                c1288c2 = c1288c;
                i12 = i5;
                xml = xmlResourceParser;
            }
            C1288c c1288c32 = c1288c2;
            C1287b c1287b32 = c1287b2;
            c1286a = new C1286a(c0584e.b(), i12);
            c1288c32.f11376a.put(c1287b32, new WeakReference(c1286a));
        }
        C0578I c5 = AbstractC0581b.c(c1286a.f11372a, c0216p);
        c0216p.q(false);
        return c5;
    }

    public static C0016l s(String statusLine) {
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        boolean n2 = kotlin.text.u.n(statusLine, "HTTP/1.");
        t tVar = t.HTTP_1_0;
        if (n2) {
            i2 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                tVar = t.HTTP_1_1;
            }
        } else {
            if (!kotlin.text.u.n(statusLine, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            i2 = 4;
        }
        int i4 = i2 + 3;
        if (statusLine.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String substring = statusLine.substring(i2, i4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (statusLine.length() <= i4) {
                str = "";
            } else {
                if (statusLine.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                str = statusLine.substring(i2 + 4);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            return new C0016l(tVar, parseInt, str);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    public static HashMap t(String str) {
        try {
            return y(new JSONObject(str));
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static String u(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e4) {
                throw new IOException("Could not serialize number", e4);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            v(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e5) {
            throw new IOException("Failed to serialize JSON", e5);
        }
    }

    public static void v(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                v(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            v(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    public static final double w(long j4) {
        return ((j4 >>> 11) * 2048) + (j4 & 2047);
    }

    public static Object x(Object obj) {
        if (obj instanceof JSONObject) {
            return y((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(x(jSONArray.get(i2)));
        }
        return arrayList;
    }

    public static HashMap y(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, x(jSONObject.get(next)));
        }
        return hashMap;
    }
}
