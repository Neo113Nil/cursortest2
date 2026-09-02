package x2;

import a3.g;
import a3.o;
import android.content.Context;
import android.content.SharedPreferences;
import f3.d;
import j3.b;
import j3.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import y2.e;
import y2.h;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3619a;

    public a(Context context, int i) {
        switch (i) {
            case 1:
                this.f3619a = context.getSharedPreferences("quiz_storage_prefs", 0);
                break;
            default:
                this.f3619a = context.getSharedPreferences("game_storage_prefs", 0);
                break;
        }
    }

    public void a(int i) {
        e f2 = f();
        int i4 = f2.f3821b + i;
        f2.f3821b = i4;
        int i5 = f2.f3822c;
        int i6 = i5 * 100;
        if (i4 >= i6) {
            f2.f3822c = i5 + 1;
            f2.f3821b = i4 - i6;
        }
        g(f2);
    }

    public ArrayList b() {
        ArrayList arrayList = new ArrayList();
        String string = this.f3619a.getString("quiz_results", "[]");
        JSONArray jSONArray = new JSONArray(string != null ? string : "[]");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string2 = jSONObject.getString("quizId");
            d.d(string2, "getString(...)");
            arrayList.add(new h(string2, jSONObject.getInt("totalQuestions"), jSONObject.getInt("correctAnswers"), jSONObject.getLong("timestamp")));
        }
        return arrayList;
    }

    public Set c() {
        String string = this.f3619a.getString("completed_missions", "[]");
        JSONArray jSONArray = new JSONArray(string != null ? string : "[]");
        int length = jSONArray.length();
        c cVar = length <= Integer.MIN_VALUE ? c.i : new c(0, length - 1, 1);
        ArrayList arrayList = new ArrayList(g.X(cVar));
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z3 = bVar.f1982h;
            if (!z3) {
                int size = arrayList.size();
                if (size == 0) {
                    return o.f115f;
                }
                if (size == 1) {
                    Set singleton = Collections.singleton(arrayList.get(0));
                    d.d(singleton, "singleton(...)");
                    return singleton;
                }
                int size2 = arrayList.size();
                if (size2 >= 0) {
                    size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(size2);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next());
                }
                return linkedHashSet;
            }
            int i = bVar.i;
            if (i != bVar.f1981g) {
                bVar.i = bVar.f1980f + i;
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                bVar.f1982h = false;
            }
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
    }

    public int d(String str) {
        Integer num;
        ArrayList b4 = b();
        ArrayList arrayList = new ArrayList();
        int size = b4.size();
        int i = 0;
        while (i < size) {
            Object obj = b4.get(i);
            i++;
            if (((h) obj).f3832a.equals(str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((h) it.next()).f3834c);
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((h) it.next()).f3834c);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int e() {
        ArrayList b4 = b();
        ArrayList arrayList = new ArrayList(g.X(b4));
        int size = b4.size();
        int i = 0;
        while (i < size) {
            Object obj = b4.get(i);
            i++;
            arrayList.add(((h) obj).f3832a);
        }
        return a3.e.Y(new LinkedHashSet(arrayList)).size();
    }

    public e f() {
        String string = this.f3619a.getString("player_data", null);
        if (string == null) {
            return new e(5000L, 0, 1, new ArrayList(new a3.b(new Integer[]{1}, true)), 1, 0, 0);
        }
        JSONObject jSONObject = new JSONObject(string);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("ownedGliders");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        return new e(jSONObject.getLong("credits"), jSONObject.getInt("experience"), jSONObject.getInt("level"), arrayList, jSONObject.getInt("selectedGlider"), jSONObject.getInt("completedRaces"), jSONObject.getInt("totalWins"));
    }

    public void g(e eVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credits", eVar.f3820a);
        jSONObject.put("experience", eVar.f3821b);
        jSONObject.put("level", eVar.f3822c);
        jSONObject.put("ownedGliders", new JSONArray((Collection) eVar.d));
        jSONObject.put("selectedGlider", eVar.f3823e);
        jSONObject.put("completedRaces", eVar.f3824f);
        jSONObject.put("totalWins", eVar.f3825g);
        this.f3619a.edit().putString("player_data", jSONObject.toString()).apply();
    }

    public boolean h(long j4) {
        e f2 = f();
        long j5 = f2.f3820a;
        if (j5 < j4) {
            return false;
        }
        f2.f3820a = j5 - j4;
        g(f2);
        return true;
    }
}
