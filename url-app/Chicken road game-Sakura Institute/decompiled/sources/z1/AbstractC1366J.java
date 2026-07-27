package z1;

import java.io.File;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: z1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1366J {

    /* renamed from: a, reason: collision with root package name */
    public static File f11815a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q.v f11816b = new Q.v();

    /* renamed from: c, reason: collision with root package name */
    public static final Q.v f11817c = new Q.v();

    /* renamed from: d, reason: collision with root package name */
    public static final Q.v f11818d = new Q.v();

    /* renamed from: e, reason: collision with root package name */
    public static final Q.v f11819e = new Q.v();

    /* renamed from: f, reason: collision with root package name */
    public static final Q.v f11820f = new Q.v();

    /* renamed from: g, reason: collision with root package name */
    public static final Q.v f11821g = new Q.v();

    /* renamed from: h, reason: collision with root package name */
    public static final Q.v f11822h = new Q.v();

    /* renamed from: i, reason: collision with root package name */
    public static final Q.v f11823i = new Q.v();

    /* renamed from: j, reason: collision with root package name */
    public static final Q.v f11824j = new Q.v();

    /* renamed from: k, reason: collision with root package name */
    public static final Q.v f11825k = new Q.v();

    /* renamed from: l, reason: collision with root package name */
    public static final Q.y f11826l = new Q.y();

    public static String a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return kotlin.text.A.P(8, uuid);
    }

    public static void b() {
        if (f11815a == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ListIterator listIterator = f11816b.listIterator();
        while (true) {
            A2.b bVar = (A2.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            C1372P c1372p = (C1372P) bVar.next();
            jSONArray.put(new JSONObject().put("id", c1372p.f11837a).put("name", c1372p.f11838b).put("date", c1372p.f11839c).put("village", c1372p.f11840d).put("level", c1372p.f11841e.name()).put("note", c1372p.f11842f));
        }
        Unit unit = Unit.f7487a;
        jSONObject.put("tournaments", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        ListIterator listIterator2 = f11817c.listIterator();
        while (true) {
            A2.b bVar2 = (A2.b) listIterator2;
            if (!bVar2.hasNext()) {
                break;
            }
            C1381g c1381g = (C1381g) bVar2.next();
            JSONObject put = new JSONObject().put("id", c1381g.f11863a).put("tournamentId", c1381g.f11864b).put("kind", c1381g.f11865c.name());
            Object obj = c1381g.f11866d;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONArray2.put(put.put("distanceM", obj).put("ageGroup", c1381g.f11867e.name()).put("female", c1381g.f11868f).put("startTime", c1381g.f11869g));
        }
        Unit unit2 = Unit.f7487a;
        jSONObject.put("events", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        ListIterator listIterator3 = f11818d.listIterator();
        while (true) {
            A2.b bVar3 = (A2.b) listIterator3;
            if (!bVar3.hasNext()) {
                break;
            }
            C1377c c1377c = (C1377c) bVar3.next();
            jSONArray3.put(new JSONObject().put("id", c1377c.f11851a).put("name", c1377c.f11852b).put("bib", c1377c.f11853c).put("team", c1377c.f11854d).put("birthYear", c1377c.f11855e).put("female", c1377c.f11856f).put("bio", c1377c.f11857g));
        }
        Unit unit3 = Unit.f7487a;
        jSONObject.put("athletes", jSONArray3);
        JSONArray jSONArray4 = new JSONArray();
        ListIterator listIterator4 = f11819e.listIterator();
        while (true) {
            A2.b bVar4 = (A2.b) listIterator4;
            if (!bVar4.hasNext()) {
                break;
            }
            C1369M c1369m = (C1369M) bVar4.next();
            jSONArray4.put(new JSONObject().put("id", c1369m.f11830a).put("name", c1369m.f11831b).put("village", c1369m.f11832c).put("color", c1369m.f11833d));
        }
        Unit unit4 = Unit.f7487a;
        jSONObject.put("teams", jSONArray4);
        JSONArray jSONArray5 = new JSONArray();
        ListIterator listIterator5 = f11820f.listIterator();
        while (true) {
            A2.b bVar5 = (A2.b) listIterator5;
            if (!bVar5.hasNext()) {
                break;
            }
            C1393s c1393s = (C1393s) bVar5.next();
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : c1393s.f11910d.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                jSONObject2.put(String.valueOf(intValue), (String) entry.getValue());
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator it = c1393s.f11911e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                int intValue2 = ((Number) entry2.getKey()).intValue();
                Iterator it2 = it;
                jSONObject3.put(String.valueOf(intValue2), ((Number) entry2.getValue()).longValue());
                it = it2;
            }
            JSONObject put2 = new JSONObject().put("id", c1393s.f11907a).put("eventId", c1393s.f11908b).put("heatNo", c1393s.f11909c).put("lanes", jSONObject2).put("times", jSONObject3);
            Intrinsics.checkNotNullExpressionValue(put2, "put(...)");
            jSONArray5.put(put2);
        }
        Unit unit5 = Unit.f7487a;
        jSONObject.put("heats", jSONArray5);
        JSONArray jSONArray6 = new JSONArray();
        ListIterator listIterator6 = f11821g.listIterator();
        while (true) {
            A2.b bVar6 = (A2.b) listIterator6;
            if (!bVar6.hasNext()) {
                break;
            }
            C1391q c1391q = (C1391q) bVar6.next();
            JSONArray jSONArray7 = new JSONArray();
            for (C1389o c1389o : c1391q.f11905c) {
                JSONArray jSONArray8 = new JSONArray();
                ListIterator listIterator7 = listIterator6;
                for (Iterator it3 = c1389o.f11902b.iterator(); it3.hasNext(); it3 = it3) {
                    Object obj2 = (Double) it3.next();
                    if (obj2 == null) {
                        obj2 = JSONObject.NULL;
                    }
                    jSONArray8.put(obj2);
                }
                jSONArray7.put(new JSONObject().put("athleteId", c1389o.f11901a).put("attempts", jSONArray8));
                listIterator6 = listIterator7;
            }
            ListIterator listIterator8 = listIterator6;
            JSONObject put3 = new JSONObject().put("id", c1391q.f11903a).put("eventId", c1391q.f11904b).put("wind", c1391q.f11906d).put("rows", jSONArray7);
            Intrinsics.checkNotNullExpressionValue(put3, "put(...)");
            jSONArray6.put(put3);
            listIterator6 = listIterator8;
        }
        Unit unit6 = Unit.f7487a;
        jSONObject.put("boards", jSONArray6);
        JSONArray jSONArray9 = new JSONArray();
        ListIterator listIterator9 = f11822h.listIterator();
        while (true) {
            A2.b bVar7 = (A2.b) listIterator9;
            if (!bVar7.hasNext()) {
                break;
            }
            C1364H c1364h = (C1364H) bVar7.next();
            JSONArray jSONArray10 = new JSONArray();
            Iterator it4 = c1364h.f11799e.iterator();
            while (it4.hasNext()) {
                C1362F c1362f = (C1362F) it4.next();
                ListIterator listIterator10 = listIterator9;
                JSONObject put4 = new JSONObject().put("order", c1362f.f11793a);
                Object obj3 = c1362f.f11794b;
                if (obj3 == null) {
                    obj3 = JSONObject.NULL;
                }
                jSONArray10.put(put4.put("athleteId", obj3));
                listIterator9 = listIterator10;
            }
            ListIterator listIterator11 = listIterator9;
            JSONObject put5 = new JSONObject().put("id", c1364h.f11795a).put("tournamentId", c1364h.f11796b).put("name", c1364h.f11797c).put("event", c1364h.f11798d).put("legs", jSONArray10);
            Intrinsics.checkNotNullExpressionValue(put5, "put(...)");
            jSONArray9.put(put5);
            listIterator9 = listIterator11;
        }
        Unit unit7 = Unit.f7487a;
        jSONObject.put("relays", jSONArray9);
        JSONArray jSONArray11 = new JSONArray();
        ListIterator listIterator12 = f11823i.listIterator();
        while (true) {
            A2.b bVar8 = (A2.b) listIterator12;
            if (!bVar8.hasNext()) {
                break;
            }
            C1361E c1361e = (C1361E) bVar8.next();
            jSONArray11.put(new JSONObject().put("id", c1361e.f11786a).put("label", c1361e.f11787b).put("holder", c1361e.f11788c).put("team", c1361e.f11789d).put("value", c1361e.f11790e).put("date", c1361e.f11791f).put("scope", c1361e.f11792g));
        }
        Unit unit8 = Unit.f7487a;
        jSONObject.put("records", jSONArray11);
        JSONArray jSONArray12 = new JSONArray();
        ListIterator listIterator13 = f11824j.listIterator();
        while (true) {
            A2.b bVar9 = (A2.b) listIterator13;
            if (!bVar9.hasNext()) {
                break;
            }
            C1374S c1374s = (C1374S) bVar9.next();
            JSONObject put6 = new JSONObject().put("id", c1374s.f11843a);
            Object obj4 = c1374s.f11844b;
            if (obj4 == null) {
                obj4 = JSONObject.NULL;
            }
            jSONArray12.put(put6.put("athleteId", obj4).put("date", c1374s.f11845c).put("distanceKm", c1374s.f11846d).put("durationSec", c1374s.f11847e).put("notes", c1374s.f11848f));
        }
        Unit unit9 = Unit.f7487a;
        jSONObject.put("training", jSONArray12);
        JSONArray jSONArray13 = new JSONArray();
        ListIterator listIterator14 = f11825k.listIterator();
        while (true) {
            A2.b bVar10 = (A2.b) listIterator14;
            if (!bVar10.hasNext()) {
                break;
            }
            C1379e c1379e = (C1379e) bVar10.next();
            jSONArray13.put(new JSONObject().put("id", c1379e.f11858a).put("athleteId", c1379e.f11859b).put("discipline", c1379e.f11860c).put("value", c1379e.f11861d).put("date", c1379e.f11862e));
        }
        Unit unit10 = Unit.f7487a;
        jSONObject.put("pbs", jSONArray13);
        J.e eVar = f11826l.b().f3899c;
        Intrinsics.d(eVar, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        jSONObject.put("onboarding", new JSONObject(eVar));
        File file = f11815a;
        if (file == null) {
            Intrinsics.g("file");
            throw null;
        }
        String jSONObject4 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
        J2.k.b(file, jSONObject4);
    }
}
