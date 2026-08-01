package defpackage;

import android.content.Context;
import com.trembin.nirefon.betfury.data.NoteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fa0 {
    public final Context b;
    public w6 f;
    public w6 g;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ha0 h = ha0.AUTOMATIC;
    public final long i = -1;
    public final gz j = new gz(1);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public final boolean n = true;
    public final boolean o = true;
    public final dc a = b90.a(NoteDatabase.class);
    public final String c = "win_notes.db";

    public fa0(Context context) {
        this.b = context;
    }

    public final ma0 a() {
        String str;
        String str2;
        w6 w6Var = this.f;
        if (w6Var == null && this.g == null) {
            w6 w6Var2 = x6.c;
            this.g = w6Var2;
            this.f = w6Var2;
        } else if (w6Var != null && this.g == null) {
            this.g = w6Var;
        } else if (w6Var == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.l;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.k;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    s9.e(r7.b("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                    return null;
                }
            }
        }
        sl slVar = new sl();
        if (this.i > 0) {
            if (this.c != null) {
                s9.k("Required value was null.");
                return null;
            }
            s9.k("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        ha0 ha0Var = this.h;
        Context context = this.b;
        ha0 resolve$room_runtime_release = ha0Var.resolve$room_runtime_release(context);
        w6 w6Var3 = this.f;
        if (w6Var3 == null) {
            s9.k("Required value was null.");
            return null;
        }
        w6 w6Var4 = this.g;
        if (w6Var4 == null) {
            s9.k("Required value was null.");
            return null;
        }
        vh vhVar = new vh(context, this.c, slVar, this.j, this.d, false, resolve$room_runtime_release, w6Var3, w6Var4, null, this.n, false, linkedHashSet2, null, null, null, this.e, this.m, false, null, null);
        vhVar.v = this.o;
        Class u = mv.u(this.a);
        Package r0 = u.getPackage();
        if (r0 == null || (str = r0.getName()) == null) {
            str = "";
        }
        String canonicalName = u.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        String concat = replace.concat("_Impl");
        try {
            if (str.length() == 0) {
                str2 = concat;
            } else {
                str2 = str + '.' + concat;
            }
            Class<?> cls = Class.forName(str2, true, u.getClassLoader());
            cls.getClass();
            ma0 ma0Var = (ma0) cls.getDeclaredConstructor(null).newInstance(null);
            ma0Var.init(vhVar);
            return ma0Var;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + u.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + u.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + u.getCanonicalName(), e3);
        }
    }
}
