package F;

import B2.C0280n;
import M7.q;
import O.X;
import O2.J;
import a.AbstractC0415a;
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
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.consent_sdk.AbstractC4404y;
import e8.t;
import g.AbstractC4518a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import m.AbstractC4742j0;
import m.C4758s;
import m.Q0;
import org.xmlpull.v1.XmlPullParserException;
import r7.C4985p;
import s7.C5001a;
import s7.C5003c;
import t0.AbstractC5051n;
import u0.C5091b;
import u0.C5095f;
import v0.AbstractC5116a;
import z0.C5260c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f907a;

    /* renamed from: b, reason: collision with root package name */
    public int f908b;

    /* renamed from: c, reason: collision with root package name */
    public Object f909c;

    /* renamed from: d, reason: collision with root package name */
    public Object f910d;

    public /* synthetic */ d(byte b9, int i) {
        this.f907a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d d(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f6;
        int i4;
        float f9;
        float f10;
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
                ColorStateList b9 = c.b(resources, xml, asAttributeSet, theme);
                return new d((Shader) null, b9, b9.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f11 = b.f(resources, theme, asAttributeSet, C.a.f369d);
        float f12 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : f11.getFloat(8, 0.0f);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f11.getFloat(9, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f11.getFloat(10, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f11.getFloat(11, 0.0f) : 0.0f;
        float f16 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : f11.getFloat(3, 0.0f);
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f11.getFloat(4, 0.0f) : 0.0f;
        int i9 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : f11.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f11.getColor(0, 0) : 0;
        boolean z8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f11.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? f11.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f6 = f12;
            i4 = f11.getInt(6, 0);
        } else {
            f6 = f12;
            i4 = 0;
        }
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f11.getFloat(5, 0.0f) : 0.0f;
        f11.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f19 = f18;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f9 = f13;
            if (next2 == 1) {
                f10 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f10 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f20 = b.f(resources, theme, asAttributeSet, C.a.f370e);
                boolean hasValue = f20.hasValue(0);
                boolean hasValue2 = f20.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f20.getColor(0, 0);
                float f21 = f20.getFloat(1, 0.0f);
                f20.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f21));
            }
            f13 = f9;
            f14 = f10;
        }
        S0.c cVar = arrayList2.size() > 0 ? new S0.c(arrayList2, arrayList) : null;
        if (cVar == null) {
            cVar = z8 ? new S0.c(color, color2, color3) : new S0.c(color, color3);
        }
        if (i9 != 1) {
            if (i9 != 2) {
                radialGradient = new LinearGradient(f6, f9, f10, f15, (int[]) cVar.f2886u, (float[]) cVar.f2887v, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f16, f17, (int[]) cVar.f2886u, (float[]) cVar.f2887v);
            }
        } else {
            if (f19 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f16, f17, f19, (int[]) cVar.f2886u, (float[]) cVar.f2887v, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new d(radialGradient, (ColorStateList) null, 0);
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean z9 = kotlin.jvm.internal.h.f(str.charAt(!z8 ? i : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                } else {
                    length--;
                }
            } else if (z9) {
                i++;
            } else {
                z8 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e6) {
            Log.w("SupportSQLite", "delete failed: ", e6);
        }
    }

    public void a() {
        e8.h hVar;
        ImageView imageView = (ImageView) this.f909c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC4742j0.a(drawable);
        }
        if (drawable == null || (hVar = (e8.h) this.f910d) == null) {
            return;
        }
        C4758s.e(drawable, hVar, imageView.getDrawableState());
    }

    public I3.a b() {
        boolean z8 = true;
        if (!AbstractC4404y.d() && !((ArrayList) this.f909c).contains(AbstractC4404y.a((Context) this.f910d))) {
            z8 = false;
        }
        return new I3.a(z8, this);
    }

    public b4.b c() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.f909c;
        return new b4.b(this.f908b, ((Long) this.f910d).longValue(), str);
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f908b + 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = ((Object[]) this.f909c)[i4];
            if (obj instanceof Y7.e) {
                Y7.e eVar = (Y7.e) obj;
                if (!kotlin.jvm.internal.h.a(eVar.d(), Y7.i.f4057h)) {
                    int i9 = ((int[]) this.f910d)[i4];
                    if (i9 >= 0) {
                        sb.append(com.anythink.core.common.d.j.f12535z);
                        sb.append(eVar.f(i9));
                    }
                } else if (((int[]) this.f910d)[i4] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f910d)[i4]);
                    sb.append("]");
                }
            } else if (obj != c8.n.f5777a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public boolean g() {
        ColorStateList colorStateList;
        return ((Shader) this.f909c) == null && (colorStateList = (ColorStateList) this.f910d) != null && colorStateList.isStateful();
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f909c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC4518a.f37823f;
        Q0 p6 = Q0.p(context, attributeSet, iArr, i);
        X.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) p6.f39326c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) p6.f39326c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.bumptech.glide.f.h(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC4742j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                U.f.c(imageView, p6.f(2));
            }
            if (typedArray.hasValue(3)) {
                U.f.d(imageView, AbstractC4742j0.b(typedArray.getInt(3, -1), null));
            }
            p6.q();
        } catch (Throwable th) {
            p6.q();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(C5260c c5260c) {
        boolean z8;
        ArrayList arrayList;
        Cursor E8 = c5260c.E("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (E8.moveToFirst()) {
                if (E8.getInt(0) == 0) {
                    z8 = true;
                    E8.close();
                    h4.c cVar = (h4.c) this.f910d;
                    h4.c.A(c5260c);
                    if (!z8) {
                        J D8 = h4.c.D(c5260c);
                        if (!D8.f2377a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + D8.f2378b);
                        }
                    }
                    c5260c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c5260c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f38233u;
                    arrayList = workDatabase_Impl.f5483f;
                    if (arrayList == null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((K0.b) workDatabase_Impl.f5483f.get(i)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z8 = false;
            E8.close();
            h4.c cVar2 = (h4.c) this.f910d;
            h4.c.A(c5260c);
            if (!z8) {
            }
            c5260c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c5260c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar2.f38233u;
            arrayList = workDatabase_Impl2.f5483f;
            if (arrayList == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0415a.h(E8, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(C5260c c5260c) {
        boolean z8;
        C5095f c5095f;
        Cursor E8 = c5260c.E("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (E8.moveToFirst()) {
                if (E8.getInt(0) != 0) {
                    z8 = true;
                    E8.close();
                    if (z8) {
                        J D8 = h4.c.D(c5260c);
                        if (!D8.f2377a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + D8.f2378b);
                        }
                        c5260c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        c5260c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    } else {
                        Cursor F8 = c5260c.F(new C0280n("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 3));
                        try {
                            String string = F8.moveToFirst() ? F8.getString(0) : null;
                            F8.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException(AbstractC5051n.f("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                            }
                        } finally {
                        }
                    }
                    h4.c cVar = (h4.c) this.f910d;
                    ((WorkDatabase_Impl) cVar.f38233u).f5478a = c5260c;
                    c5260c.A("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f38233u;
                    workDatabase_Impl.getClass();
                    c5095f = workDatabase_Impl.f5481d;
                    c5095f.getClass();
                    synchronized (c5095f.f41025k) {
                        if (c5095f.f41021f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            c5260c.A("PRAGMA temp_store = MEMORY;");
                            c5260c.A("PRAGMA recursive_triggers='ON';");
                            c5260c.A("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            c5095f.c(c5260c);
                            c5095f.f41022g = c5260c.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            c5095f.f41021f = true;
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) cVar.f38233u).f5483f;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((K0.b) ((WorkDatabase_Impl) cVar.f38233u).f5483f.get(i)).getClass();
                            c5260c.b();
                            try {
                                c5260c.A("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - K0.m.f1524a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c5260c.G();
                                c5260c.z();
                            } catch (Throwable th) {
                                c5260c.z();
                                throw th;
                            }
                        }
                    }
                    this.f909c = null;
                    return;
                }
            }
            z8 = false;
            E8.close();
            if (z8) {
            }
            h4.c cVar2 = (h4.c) this.f910d;
            ((WorkDatabase_Impl) cVar2.f38233u).f5478a = c5260c;
            c5260c.A("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar2.f38233u;
            workDatabase_Impl2.getClass();
            c5095f = workDatabase_Impl2.f5481d;
            c5095f.getClass();
            synchronized (c5095f.f41025k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085 A[EDGE_INSN: B:86:0x0085->B:69:0x0085 BREAK  A[LOOP:3: B:48:0x0022->B:70:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(C5260c c5260c, int i, int i4) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z8;
        C5091b c5091b = (C5091b) this.f909c;
        h4.c cVar = (h4.c) this.f910d;
        if (c5091b != null) {
            h8.d dVar = c5091b.f41004d;
            dVar.getClass();
            if (i == i4) {
                iterable = C4985p.f40358n;
            } else {
                boolean z9 = i4 > i;
                ArrayList arrayList = new ArrayList();
                int i9 = i;
                do {
                    if (z9) {
                        if (i9 >= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) dVar.f38261u).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer targetVersion : z9 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z9) {
                                int i10 = i9 + 1;
                                kotlin.jvm.internal.h.d(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i10 <= intValue && intValue <= i4) {
                                    Object obj = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.h.b(obj);
                                    arrayList.add(obj);
                                    i9 = targetVersion.intValue();
                                    z8 = true;
                                    break;
                                }
                            } else {
                                kotlin.jvm.internal.h.d(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i4 <= intValue2 && intValue2 < i9) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.h.b(obj2);
                                    arrayList.add(obj2);
                                    i9 = targetVersion.intValue();
                                    z8 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z8 = false;
                    } else {
                        if (i9 <= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) dVar.f38261u).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                        }
                    }
                } while (z8);
                iterable = null;
            }
            if (iterable != null) {
                C5003c c5003c = new C5003c(10);
                Cursor E8 = c5260c.E("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (E8.moveToNext()) {
                    try {
                        c5003c.add(E8.getString(0));
                    } finally {
                    }
                }
                E8.close();
                ListIterator listIterator = p8.g.d(c5003c).listIterator(0);
                while (true) {
                    C5001a c5001a = (C5001a) listIterator;
                    if (!c5001a.hasNext()) {
                        break;
                    }
                    String triggerName = (String) c5001a.next();
                    kotlin.jvm.internal.h.d(triggerName, "triggerName");
                    if (q.I(triggerName, "room_fts_content_sync_")) {
                        c5260c.A("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC5116a) it.next()).a(c5260c);
                }
                J D8 = h4.c.D(c5260c);
                if (!D8.f2377a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + D8.f2378b);
                }
                c5260c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c5260c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
            }
        }
        C5091b c5091b2 = (C5091b) this.f909c;
        if (c5091b2 != null) {
            if (!((i <= i4 || !c5091b2.f41010k) && c5091b2.f41009j && ((linkedHashSet = c5091b2.f41011l) == null || !linkedHashSet.contains(Integer.valueOf(i))))) {
                c5260c.A("DROP TABLE IF EXISTS `Dependency`");
                c5260c.A("DROP TABLE IF EXISTS `WorkSpec`");
                c5260c.A("DROP TABLE IF EXISTS `WorkTag`");
                c5260c.A("DROP TABLE IF EXISTS `SystemIdInfo`");
                c5260c.A("DROP TABLE IF EXISTS `WorkName`");
                c5260c.A("DROP TABLE IF EXISTS `WorkProgress`");
                c5260c.A("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f38233u;
                ArrayList arrayList2 = workDatabase_Impl.f5483f;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((K0.b) workDatabase_Impl.f5483f.get(i11)).getClass();
                    }
                }
                h4.c.A(c5260c);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i4 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public String toString() {
        switch (this.f907a) {
            case 5:
                return f();
            case 6:
            default:
                return super.toString();
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((t) this.f909c) == t.f37502v) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f908b);
                sb.append(' ');
                sb.append((String) this.f910d);
                return sb.toString();
        }
    }

    public d(Context context) {
        this.f907a = 1;
        this.f909c = new ArrayList();
        this.f908b = 0;
        this.f910d = context.getApplicationContext();
    }

    public d(t tVar, int i, String str) {
        this.f907a = 7;
        this.f909c = tVar;
        this.f908b = i;
        this.f910d = str;
    }

    public d(N6.a aVar) {
        this.f907a = 2;
        this.f909c = new ConcurrentLinkedDeque();
        this.f908b = 1;
        this.f910d = aVar;
    }

    public d(C5091b c5091b, h4.c cVar) {
        this.f907a = 9;
        this.f907a = 9;
        this.f908b = 16;
        this.f909c = c5091b;
        this.f910d = cVar;
    }

    public d(ImageView imageView) {
        this.f907a = 8;
        this.f908b = 0;
        this.f909c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f907a = 0;
        this.f909c = shader;
        this.f910d = colorStateList;
        this.f908b = i;
    }

    public d(N1.h hVar) {
        this.f907a = 10;
        this.f910d = O1.d.a(150, new i8.m(this));
        this.f909c = hVar;
    }

    public void i(C5260c c5260c) {
    }
}
