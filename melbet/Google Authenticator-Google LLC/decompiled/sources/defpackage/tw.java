package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tw {
    public tw(sd sdVar) {
        new WeakReference(sdVar);
        rv.o(sdVar.K);
        rv.o(sdVar.L);
        rv.o(sdVar.M);
        rv.o(sdVar.N);
        rv.o(sdVar.O);
    }

    public static void A(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            tf tfVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                break;
                            } else {
                                tn tnVar = new tn();
                                int attributeCount = xml.getAttributeCount();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= attributeCount) {
                                        break;
                                    } else {
                                        String attributeName = xml.getAttributeName(i2);
                                        String attributeValue = xml.getAttributeValue(i2);
                                        if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                            int i3 = -1;
                                            int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                            if (identifier != -1) {
                                                i3 = identifier;
                                            } else if (attributeValue.length() > 1) {
                                                i3 = Integer.parseInt(attributeValue.substring(1));
                                            } else {
                                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                            }
                                            tnVar.g(context, xml);
                                            sparseArray2.put(i3, tnVar);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                tf tfVar2 = new tf(context, xml);
                                sparseArray.put(tfVar2.a, tfVar2);
                                tfVar = tfVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                tg tgVar = new tg(context, xml);
                                if (tfVar != null) {
                                    ((ArrayList) tfVar.c).add(tgVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", a.Y(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", a.Y(i, "Error parsing resource: "), e2);
        }
    }

    public static sx B(sd sdVar, int i, ArrayList arrayList, sx sxVar) {
        int i2;
        int i3 = i == 0 ? sdVar.ap : sdVar.aq;
        if (i3 != -1 && (sxVar == null || i3 != sxVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                sx sxVar2 = (sx) arrayList.get(i4);
                if (sxVar2.c == i3) {
                    if (sxVar != null) {
                        sxVar.c(i, sxVar2);
                        arrayList.remove(sxVar);
                    }
                    sxVar = sxVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return sxVar;
        }
        if (sxVar == null) {
            if (sdVar instanceof si) {
                si siVar = (si) sdVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= siVar.aK) {
                        i2 = -1;
                        break;
                    }
                    sd sdVar2 = siVar.aJ[i5];
                    if (i == 0) {
                        i2 = sdVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = sdVar2.aq;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        sx sxVar3 = (sx) arrayList.get(i6);
                        if (sxVar3.c == i2) {
                            sxVar = sxVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (sxVar == null) {
                sxVar = new sx(i);
            }
            arrayList.add(sxVar);
        }
        if (sxVar.d(sdVar)) {
            if (sdVar instanceof sh) {
                sh shVar = (sh) sdVar;
                shVar.d.d(shVar.as == 0 ? 1 : 0, arrayList, sxVar);
            }
            if (i == 0) {
                sdVar.ap = sxVar.c;
                sdVar.K.d(0, arrayList, sxVar);
                sdVar.M.d(0, arrayList, sxVar);
            } else {
                sdVar.aq = sxVar.c;
                sdVar.L.d(1, arrayList, sxVar);
                sdVar.O.d(1, arrayList, sxVar);
                sdVar.N.d(1, arrayList, sxVar);
            }
            sdVar.R.d(i, arrayList, sxVar);
        }
        return sxVar;
    }

    public static sx C(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sx sxVar = (sx) arrayList.get(i2);
            if (i == sxVar.c) {
                return sxVar;
            }
        }
        return null;
    }

    public static boolean D(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void E(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void F(Object obj) {
        obj.getClass();
    }

    public static void G(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static Object H(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static wh[] I(List list) {
        return (wh[]) list.get(0);
    }

    public View a(MenuItem menuItem) {
        throw null;
    }

    public void b(SubMenu subMenu) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(kee keeVar) {
        throw null;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(View view, View view2) {
        return false;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean t(View view) {
        return false;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public Parcelable x(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean z(View view, Rect rect) {
        return false;
    }

    public void i() {
    }

    public void h(tz tzVar) {
    }

    public tw(Context context, AttributeSet attributeSet) {
    }

    public tw(byte[] bArr) {
    }

    public tw() {
    }

    public void r(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void w(View view, Parcelable parcelable) {
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }
}
