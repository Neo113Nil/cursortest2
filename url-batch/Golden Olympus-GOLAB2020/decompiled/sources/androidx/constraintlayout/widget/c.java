package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f11193a;

    /* renamed from: b, reason: collision with root package name */
    d f11194b;

    /* renamed from: c, reason: collision with root package name */
    int f11195c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f11196d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f11197e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray f11198f = new SparseArray();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f11199a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f11200b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f11201c;

        /* renamed from: d, reason: collision with root package name */
        d f11202d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f11201c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.q4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.r4) {
                    this.f11199a = obtainStyledAttributes.getResourceId(index, this.f11199a);
                } else if (index == g.s4) {
                    this.f11201c = obtainStyledAttributes.getResourceId(index, this.f11201c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11201c);
                    context.getResources().getResourceName(this.f11201c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f11202d = dVar;
                        dVar.f(context, this.f11201c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f11200b.add(bVar);
        }

        public int b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f11200b.size(); i4++) {
                if (((b) this.f11200b.get(i4)).a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f11203a;

        /* renamed from: b, reason: collision with root package name */
        float f11204b;

        /* renamed from: c, reason: collision with root package name */
        float f11205c;

        /* renamed from: d, reason: collision with root package name */
        float f11206d;

        /* renamed from: e, reason: collision with root package name */
        int f11207e;

        /* renamed from: f, reason: collision with root package name */
        d f11208f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f11203a = Float.NaN;
            this.f11204b = Float.NaN;
            this.f11205c = Float.NaN;
            this.f11206d = Float.NaN;
            this.f11207e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.M4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.N4) {
                    this.f11207e = obtainStyledAttributes.getResourceId(index, this.f11207e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11207e);
                    context.getResources().getResourceName(this.f11207e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f11208f = dVar;
                        dVar.f(context, this.f11207e);
                    }
                } else if (index == g.O4) {
                    this.f11206d = obtainStyledAttributes.getDimension(index, this.f11206d);
                } else if (index == g.P4) {
                    this.f11204b = obtainStyledAttributes.getDimension(index, this.f11204b);
                } else if (index == g.Q4) {
                    this.f11205c = obtainStyledAttributes.getDimension(index, this.f11205c);
                } else if (index == g.R4) {
                    this.f11203a = obtainStyledAttributes.getDimension(index, this.f11203a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f4, float f5) {
            if (!Float.isNaN(this.f11203a) && f4 < this.f11203a) {
                return false;
            }
            if (!Float.isNaN(this.f11204b) && f5 < this.f11204b) {
                return false;
            }
            if (Float.isNaN(this.f11205c) || f4 <= this.f11205c) {
                return Float.isNaN(this.f11206d) || f5 <= this.f11206d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i4) {
        this.f11193a = constraintLayout;
        a(context, i4);
    }

    private void a(Context context, int i4) {
        char c4;
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    if (c4 != 0 && c4 != 1) {
                        if (c4 == 2) {
                            aVar = new a(context, xml);
                            this.f11197e.put(aVar.f11199a, aVar);
                        } else if (c4 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c4 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if ("id".equals(xmlPullParser.getAttributeName(i4))) {
                String attributeValue = xmlPullParser.getAttributeValue(i4);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.m(context, xmlPullParser);
                this.f11198f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }

    public void d(int i4, float f4, float f5) {
        int b4;
        int i5 = this.f11195c;
        if (i5 == i4) {
            a aVar = i4 == -1 ? (a) this.f11197e.valueAt(0) : (a) this.f11197e.get(i5);
            int i6 = this.f11196d;
            if ((i6 == -1 || !((b) aVar.f11200b.get(i6)).a(f4, f5)) && this.f11196d != (b4 = aVar.b(f4, f5))) {
                d dVar = b4 == -1 ? this.f11194b : ((b) aVar.f11200b.get(b4)).f11208f;
                if (b4 != -1) {
                    int i7 = ((b) aVar.f11200b.get(b4)).f11207e;
                }
                if (dVar == null) {
                    return;
                }
                this.f11196d = b4;
                dVar.c(this.f11193a);
                return;
            }
            return;
        }
        this.f11195c = i4;
        a aVar2 = (a) this.f11197e.get(i4);
        int b5 = aVar2.b(f4, f5);
        d dVar2 = b5 == -1 ? aVar2.f11202d : ((b) aVar2.f11200b.get(b5)).f11208f;
        if (b5 != -1) {
            int i8 = ((b) aVar2.f11200b.get(b5)).f11207e;
        }
        if (dVar2 != null) {
            this.f11196d = b5;
            dVar2.c(this.f11193a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i4 + ", dim =" + f4 + ", " + f5);
    }
}
