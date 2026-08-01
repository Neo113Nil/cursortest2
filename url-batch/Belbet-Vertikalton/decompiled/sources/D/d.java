package D;

import M.P;
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
import androidx.room.x;
import androidx.room.y;
import g.AbstractC0122a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import k0.InterfaceC0199a;
import n.AbstractC0293p0;
import n.C0302u;
import n.Y0;
import org.xmlpull.v1.XmlPullParserException;
import z1.t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167a;

    /* renamed from: b, reason: collision with root package name */
    public int f168b;

    /* renamed from: c, reason: collision with root package name */
    public Object f169c;

    /* renamed from: d, reason: collision with root package name */
    public Object f170d;

    public d(t tVar, int i, String str) {
        this.f167a = 1;
        this.f169c = tVar;
        this.f168b = i;
        this.f170d = str;
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
        TypedArray f7 = b.f(resources, theme, asAttributeSet, A.a.f3d);
        float f8 = !b.c(xml, "startX") ? 0.0f : f7.getFloat(8, 0.0f);
        float f9 = !b.c(xml, "startY") ? 0.0f : f7.getFloat(9, 0.0f);
        float f10 = !b.c(xml, "endX") ? 0.0f : f7.getFloat(10, 0.0f);
        float f11 = !b.c(xml, "endY") ? 0.0f : f7.getFloat(11, 0.0f);
        float f12 = !b.c(xml, "centerX") ? 0.0f : f7.getFloat(3, 0.0f);
        float f13 = !b.c(xml, "centerY") ? 0.0f : f7.getFloat(4, 0.0f);
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
            f4 = f7.getFloat(5, 0.0f);
        } else {
            f3 = f13;
            f4 = 0.0f;
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
                TypedArray f16 = b.f(resources, theme, asAttributeSet, A.a.e);
                boolean hasValue = f16.hasValue(0);
                boolean hasValue2 = f16.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f16.getColor(0, 0);
                float f17 = f16.getFloat(1, 0.0f);
                f16.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f10 = f5;
            f9 = f6;
        }
        B1.c cVar = arrayList2.size() > 0 ? new B1.c(arrayList2, arrayList) : null;
        if (cVar == null) {
            cVar = c2 ? new B1.c(color, color2, color3) : new B1.c(color, color3);
        }
        if (i4 == 1) {
            float f18 = f2;
            float f19 = f3;
            i3 = 0;
            if (f14 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f18, f19, f14, (int[]) cVar.f68b, (float[]) cVar.f69c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != 2) {
            i3 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f15, (int[]) cVar.f68b, (float[]) cVar.f69c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) cVar.f68b, (float[]) cVar.f69c);
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
            boolean z3 = j1.h.f(str.charAt(!z2 ? i : length), 32) <= 0;
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
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a() {
        Y0 y02;
        ImageView imageView = (ImageView) this.f169c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0293p0.a(drawable);
        }
        if (drawable == null || (y02 = (Y0) this.f170d) == null) {
            return;
        }
        C0302u.e(drawable, y02, imageView.getDrawableState());
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f169c) == null && (colorStateList = (ColorStateList) this.f170d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f169c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0122a.f2699f;
        I0.h r2 = I0.h.r(context, attributeSet, iArr, i);
        P.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) r2.f592c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) r2.f592c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = H1.d.F(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0293p0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                S.f.c(imageView, r2.g(2));
            }
            if (typedArray.hasValue(3)) {
                S.f.d(imageView, AbstractC0293p0.c(typedArray.getInt(3, -1), null));
            }
            r2.t();
        } catch (Throwable th) {
            r2.t();
            throw th;
        }
    }

    public void f(InterfaceC0199a interfaceC0199a) {
        l0.c cVar = (l0.c) interfaceC0199a;
        Cursor u2 = cVar.u("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (u2.moveToFirst()) {
                if (u2.getInt(0) == 0) {
                    z2 = true;
                }
            }
            H1.l.j(u2, null);
            x xVar = (x) this.f170d;
            xVar.createAllTables(interfaceC0199a);
            if (!z2) {
                y onValidateSchema = xVar.onValidateSchema(interfaceC0199a);
                if (!onValidateSchema.f2141a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f2142b);
                }
            }
            i(cVar);
            xVar.onCreate(interfaceC0199a);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(InterfaceC0199a interfaceC0199a) {
        boolean z2;
        l0.c cVar = (l0.c) interfaceC0199a;
        Cursor u2 = cVar.u("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (u2.moveToFirst()) {
                if (u2.getInt(0) != 0) {
                    z2 = true;
                    H1.l.j(u2, null);
                    x xVar = (x) this.f170d;
                    if (z2) {
                        y onValidateSchema = xVar.onValidateSchema(interfaceC0199a);
                        if (!onValidateSchema.f2141a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f2142b);
                        }
                        xVar.onPostMigrate(interfaceC0199a);
                        i(cVar);
                    } else {
                        Cursor g2 = cVar.g(new B1.c("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = g2.moveToFirst() ? g2.getString(0) : null;
                            H1.l.j(g2, null);
                            if (!"ad2920939625b3409e4302d305cde49b".equals(string) && !"c7d7480d372dd0be8de8b6b99233ce65".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ad2920939625b3409e4302d305cde49b, found: " + string);
                            }
                        } finally {
                        }
                    }
                    xVar.onOpen(interfaceC0199a);
                    this.f169c = null;
                }
            }
            z2 = false;
            H1.l.j(u2, null);
            x xVar2 = (x) this.f170d;
            if (z2) {
            }
            xVar2.onOpen(interfaceC0199a);
            this.f169c = null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0041 A[EDGE_INSN: B:60:0x0041->B:43:0x0041 BREAK  A[LOOP:0: B:22:0x0029->B:44:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(l0.c cVar, int i, int i2) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z2;
        androidx.room.j jVar = (androidx.room.j) this.f169c;
        x xVar = (x) this.f170d;
        if (jVar != null) {
            C1.d dVar = jVar.f2103b;
            dVar.getClass();
            if (i == i2) {
                iterable = X0.t.f1385a;
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
                        treeMap = (TreeMap) ((LinkedHashMap) dVar.f145b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z3 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z3) {
                                int i4 = i3 + 1;
                                j1.h.d(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i4 <= intValue && intValue <= i2) {
                                    Object obj = treeMap.get(num);
                                    j1.h.b(obj);
                                    arrayList.add(obj);
                                    i3 = num.intValue();
                                    z2 = true;
                                    break;
                                }
                            } else {
                                j1.h.d(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i2 <= intValue2 && intValue2 < i3) {
                                    Object obj2 = treeMap.get(num);
                                    j1.h.b(obj2);
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
                        treeMap = (TreeMap) ((LinkedHashMap) dVar.f145b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                        }
                    }
                } while (z2);
                iterable = null;
            }
            if (iterable != null) {
                xVar.onPreMigrate(cVar);
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                y onValidateSchema = xVar.onValidateSchema(cVar);
                if (!onValidateSchema.f2141a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f2142b);
                }
                xVar.onPostMigrate(cVar);
                i(cVar);
                return;
            }
        }
        androidx.room.j jVar2 = (androidx.room.j) this.f169c;
        if (jVar2 != null && (!jVar2.f2107g || ((linkedHashSet = jVar2.f2108h) != null && linkedHashSet.contains(Integer.valueOf(i))))) {
            xVar.dropAllTables(cVar);
            xVar.createAllTables(cVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void i(l0.c cVar) {
        cVar.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad2920939625b3409e4302d305cde49b')");
    }

    public String toString() {
        switch (this.f167a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((t) this.f169c) == t.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f168b);
                sb.append(' ');
                sb.append((String) this.f170d);
                String sb2 = sb.toString();
                j1.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public d(androidx.room.j jVar, x xVar) {
        this.f167a = 2;
        j1.h.e(jVar, "configuration");
        int i = xVar.version;
        this.f167a = 2;
        this.f168b = i;
        this.f169c = jVar;
        this.f170d = xVar;
    }

    public d(ImageView imageView) {
        this.f167a = 3;
        this.f168b = 0;
        this.f169c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f167a = 0;
        this.f169c = shader;
        this.f170d = colorStateList;
        this.f168b = i;
    }
}
