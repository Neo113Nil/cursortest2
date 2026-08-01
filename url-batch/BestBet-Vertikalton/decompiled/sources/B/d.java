package B;

import K.Q;
import Y0.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import g.C0121b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeMap;
import k.C0191o;
import l.AbstractC0245l0;
import l.C0260t;
import l.S0;
import l0.C0276c;
import org.xmlpull.v1.XmlPullParserException;
import u0.C0365d;
import u0.C0372k;
import y.AbstractC0394a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31a;

    /* renamed from: b, reason: collision with root package name */
    public int f32b;

    /* renamed from: c, reason: collision with root package name */
    public Object f33c;
    public Object d;

    public d(z1.q qVar, int i, String str) {
        this.f31a = 1;
        this.f33c = qVar;
        this.f32b = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b2 = c.b(resources, xml, asAttributeSet, theme);
                return new d((Shader) null, b2, b2.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f7 = b.f(resources, theme, asAttributeSet, AbstractC0394a.d);
        float f8 = !b.c(xml, "startX") ? 0.0f : f7.getFloat(8, RecyclerView.f1937A0);
        float f9 = !b.c(xml, "startY") ? 0.0f : f7.getFloat(9, RecyclerView.f1937A0);
        float f10 = !b.c(xml, "endX") ? 0.0f : f7.getFloat(10, RecyclerView.f1937A0);
        float f11 = !b.c(xml, "endY") ? 0.0f : f7.getFloat(11, RecyclerView.f1937A0);
        float f12 = !b.c(xml, "centerX") ? 0.0f : f7.getFloat(3, RecyclerView.f1937A0);
        float f13 = !b.c(xml, "centerY") ? 0.0f : f7.getFloat(4, RecyclerView.f1937A0);
        int i4 = !b.c(xml, "type") ? 0 : f7.getInt(2, 0);
        int color = !b.c(xml, "startColor") ? 0 : f7.getColor(0, 0);
        boolean c2 = b.c(xml, "centerColor");
        int color2 = !b.c(xml, "centerColor") ? 0 : f7.getColor(7, 0);
        int color3 = !b.c(xml, "endColor") ? 0 : f7.getColor(1, 0);
        if (b.c(xml, "tileMode")) {
            f2 = f12;
            i2 = f7.getInt(6, 0);
        } else {
            f2 = f12;
            i2 = 0;
        }
        if (b.c(xml, "gradientRadius")) {
            f3 = f13;
            f4 = f7.getFloat(5, RecyclerView.f1937A0);
        } else {
            f3 = f13;
            f4 = RecyclerView.f1937A0;
        }
        f7.recycle();
        int depth = xml.getDepth() + 1;
        float f14 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f10;
            if (next2 == 1) {
                f6 = f9;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f9;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f16 = b.f(resources, theme, asAttributeSet, AbstractC0394a.f4569e);
                boolean hasValue = f16.hasValue(0);
                boolean hasValue2 = f16.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f16.getColor(0, 0);
                float f17 = f16.getFloat(1, RecyclerView.f1937A0);
                f16.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f10 = f5;
            f9 = f6;
        }
        C0365d c0365d = arrayList2.size() > 0 ? new C0365d(arrayList2, arrayList) : null;
        if (c0365d == null) {
            c0365d = c2 ? new C0365d(color, color2, color3) : new C0365d(color, color3);
        }
        if (i4 == 1) {
            float f18 = f2;
            float f19 = f3;
            i3 = 0;
            if (f14 <= RecyclerView.f1937A0) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f18, f19, f14, (int[]) c0365d.f4175b, (float[]) c0365d.f4176c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != 2) {
            i3 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f15, (int[]) c0365d.f4175b, (float[]) c0365d.f4176c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) c0365d.f4175b, (float[]) c0365d.f4176c);
        }
        return new d(radialGradient, (ColorStateList) null, i3);
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean z3 = k1.e.f(str.charAt(!z2 ? i : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e2) {
            Log.w("SupportSQLite", "delete failed: ", e2);
        }
    }

    public void a() {
        S0 s0;
        ImageView imageView = (ImageView) this.f33c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0245l0.a(drawable);
        }
        if (drawable == null || (s0 = (S0) this.d) == null) {
            return;
        }
        C0260t.e(drawable, s0, imageView.getDrawableState());
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f33c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f33c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f2518f;
        C0372k j2 = C0372k.j(context, attributeSet, iArr, i);
        Q.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) j2.f4191b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) j2.f4191b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0091d.j(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0245l0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Q.f.c(imageView, j2.c(2));
            }
            if (typedArray.hasValue(3)) {
                Q.f.d(imageView, AbstractC0245l0.b(typedArray.getInt(3, -1), null));
            }
            j2.l();
        } catch (Throwable th) {
            j2.l();
            throw th;
        }
    }

    public void f(C0276c c0276c) {
    }

    public void g(C0276c c0276c) {
        Cursor t2 = c0276c.t("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (t2.moveToFirst()) {
                if (t2.getInt(0) == 0) {
                    z2 = true;
                }
            }
            b1.g.d(t2, null);
            C0191o c0191o = (C0191o) this.d;
            c0276c.p("CREATE TABLE IF NOT EXISTS `habits` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `symbolIndex` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `active` INTEGER NOT NULL)");
            c0276c.p("CREATE TABLE IF NOT EXISTS `completions` (`habitId` INTEGER NOT NULL, `dayEpoch` INTEGER NOT NULL, PRIMARY KEY(`habitId`, `dayEpoch`))");
            c0276c.p("CREATE TABLE IF NOT EXISTS `streak_state` (`id` INTEGER NOT NULL, `currentStreak` INTEGER NOT NULL, `bestStreak` INTEGER NOT NULL, `lastCompletedDay` INTEGER NOT NULL, `lastOpenedDay` INTEGER NOT NULL, `graceRemaining` INTEGER NOT NULL, `multiplier` REAL NOT NULL, PRIMARY KEY(`id`))");
            c0276c.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c0276c.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6e096bef472f867b22eb57a477af1765')");
            if (!z2) {
                C0.d k2 = C0191o.k(c0276c);
                if (!k2.f91a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) k2.f92b));
                }
            }
            j(c0276c);
            ArrayList arrayList = ((FortuneQuestDatabase_Impl) c0191o.f3187a).f2100f;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b1.g.d(t2, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(C0276c c0276c) {
        boolean z2;
        h0.l lVar;
        Cursor t2 = c0276c.t("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (t2.moveToFirst()) {
                if (t2.getInt(0) != 0) {
                    z2 = true;
                    b1.g.d(t2, null);
                    if (z2) {
                        C0.d k2 = C0191o.k(c0276c);
                        if (!k2.f91a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) k2.f92b));
                        }
                        j(c0276c);
                    } else {
                        Cursor u2 = c0276c.u(new U.q("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = u2.moveToFirst() ? u2.getString(0) : null;
                            b1.g.d(u2, null);
                            if (!"6e096bef472f867b22eb57a477af1765".equals(string) && !"84fede03119de37be2f2b5716cc9882f".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 6e096bef472f867b22eb57a477af1765, found: " + string);
                            }
                        } finally {
                        }
                    }
                    C0191o c0191o = (C0191o) this.d;
                    ((FortuneQuestDatabase_Impl) c0191o.f3187a).f2096a = c0276c;
                    FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl = (FortuneQuestDatabase_Impl) c0191o.f3187a;
                    fortuneQuestDatabase_Impl.getClass();
                    lVar = fortuneQuestDatabase_Impl.f2099e;
                    lVar.getClass();
                    synchronized (lVar.f2978k) {
                        if (lVar.f2975f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            c0276c.p("PRAGMA temp_store = MEMORY;");
                            c0276c.p("PRAGMA recursive_triggers='ON';");
                            c0276c.p("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            lVar.c(c0276c);
                            lVar.f2976g = c0276c.j("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            lVar.f2975f = true;
                        }
                    }
                    ArrayList arrayList = ((FortuneQuestDatabase_Impl) c0191o.f3187a).f2100f;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                    this.f33c = null;
                    return;
                }
            }
            z2 = false;
            b1.g.d(t2, null);
            if (z2) {
            }
            C0191o c0191o2 = (C0191o) this.d;
            ((FortuneQuestDatabase_Impl) c0191o2.f3187a).f2096a = c0276c;
            FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl2 = (FortuneQuestDatabase_Impl) c0191o2.f3187a;
            fortuneQuestDatabase_Impl2.getClass();
            lVar = fortuneQuestDatabase_Impl2.f2099e;
            lVar.getClass();
            synchronized (lVar.f2978k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0043 A[EDGE_INSN: B:88:0x0043->B:71:0x0043 BREAK  A[LOOP:2: B:50:0x002c->B:72:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(C0276c c0276c, int i, int i2) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z2;
        C0121b c0121b = (C0121b) this.f33c;
        C0191o c0191o = (C0191o) this.d;
        if (c0121b != null) {
            A0.c cVar = (A0.c) c0121b.d;
            cVar.getClass();
            if (i == i2) {
                iterable = s.f1516a;
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                do {
                    if (z3) {
                        if (i3 >= i2) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f6b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z3 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z3) {
                                int i4 = i3 + 1;
                                k1.e.d(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i4 <= intValue && intValue <= i2) {
                                    Object obj = treeMap.get(num);
                                    k1.e.b(obj);
                                    arrayList.add(obj);
                                    i3 = num.intValue();
                                    z2 = true;
                                    break;
                                }
                            } else {
                                k1.e.d(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i2 <= intValue2 && intValue2 < i3) {
                                    Object obj2 = treeMap.get(num);
                                    k1.e.b(obj2);
                                    arrayList.add(obj2);
                                    i3 = num.intValue();
                                    z2 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                    } else {
                        if (i3 <= i2) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f6b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                        }
                    }
                } while (z2);
                iterable = null;
            }
            if (iterable != null) {
                Z0.c cVar2 = new Z0.c(10);
                Cursor t2 = c0276c.t("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (t2.moveToNext()) {
                    try {
                        cVar2.add(t2.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            b1.g.d(t2, th);
                            throw th2;
                        }
                    }
                }
                b1.g.d(t2, null);
                cVar2.f();
                cVar2.f1535c = true;
                if (cVar2.f1534b <= 0) {
                    cVar2 = Z0.c.d;
                }
                ListIterator listIterator = cVar2.listIterator(0);
                while (true) {
                    Z0.a aVar = (Z0.a) listIterator;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    String str = (String) aVar.next();
                    k1.e.d(str, "triggerName");
                    if (r1.l.C(str, "room_fts_content_sync_", false)) {
                        c0276c.p("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                C0.d k2 = C0191o.k(c0276c);
                if (!k2.f91a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) k2.f92b));
                }
                j(c0276c);
                return;
            }
        }
        C0121b c0121b2 = (C0121b) this.f33c;
        if (c0121b2 != null) {
            if (!(c0121b2.f2640b && ((linkedHashSet = (LinkedHashSet) c0121b2.h) == null || !linkedHashSet.contains(Integer.valueOf(i))))) {
                c0276c.p("DROP TABLE IF EXISTS `habits`");
                c0276c.p("DROP TABLE IF EXISTS `completions`");
                c0276c.p("DROP TABLE IF EXISTS `streak_state`");
                ArrayList arrayList2 = ((FortuneQuestDatabase_Impl) c0191o.f3187a).f2100f;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                }
                c0276c.p("CREATE TABLE IF NOT EXISTS `habits` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `symbolIndex` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `active` INTEGER NOT NULL)");
                c0276c.p("CREATE TABLE IF NOT EXISTS `completions` (`habitId` INTEGER NOT NULL, `dayEpoch` INTEGER NOT NULL, PRIMARY KEY(`habitId`, `dayEpoch`))");
                c0276c.p("CREATE TABLE IF NOT EXISTS `streak_state` (`id` INTEGER NOT NULL, `currentStreak` INTEGER NOT NULL, `bestStreak` INTEGER NOT NULL, `lastCompletedDay` INTEGER NOT NULL, `lastOpenedDay` INTEGER NOT NULL, `graceRemaining` INTEGER NOT NULL, `multiplier` REAL NOT NULL, PRIMARY KEY(`id`))");
                c0276c.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0276c.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6e096bef472f867b22eb57a477af1765')");
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void j(C0276c c0276c) {
        c0276c.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0276c.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6e096bef472f867b22eb57a477af1765')");
    }

    public String toString() {
        switch (this.f31a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((z1.q) this.f33c) == z1.q.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f32b);
                sb.append(' ');
                sb.append((String) this.d);
                String sb2 = sb.toString();
                k1.e.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public d(C0121b c0121b, C0191o c0191o) {
        this.f31a = 2;
        this.f31a = 2;
        this.f32b = 1;
        this.f33c = c0121b;
        this.d = c0191o;
    }

    public d(ImageView imageView) {
        this.f31a = 3;
        this.f32b = 0;
        this.f33c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f31a = 0;
        this.f33c = shader;
        this.d = colorStateList;
        this.f32b = i;
    }
}
