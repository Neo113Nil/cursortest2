package B;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final Object f169a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final x f170a;

        a(x xVar) {
            this.f170a = xVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            w b4 = this.f170a.b(i4);
            if (b4 == null) {
                return null;
            }
            return b4.M0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i4) {
            List c4 = this.f170a.c(str, i4);
            if (c4 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c4.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(((w) c4.get(i5)).M0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i4) {
            w d4 = this.f170a.d(i4);
            if (d4 == null) {
                return null;
            }
            return d4.M0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f170a.f(i4, i5, bundle);
        }
    }

    static class b extends a {
        b(x xVar) {
            super(xVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f170a.a(i4, w.N0(accessibilityNodeInfo), str, bundle);
        }
    }

    public x() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f169a = new b(this);
        } else {
            this.f169a = new a(this);
        }
    }

    public w b(int i4) {
        return null;
    }

    public List c(String str, int i4) {
        return null;
    }

    public w d(int i4) {
        return null;
    }

    public Object e() {
        return this.f169a;
    }

    public boolean f(int i4, int i5, Bundle bundle) {
        return false;
    }

    public x(Object obj) {
        this.f169a = obj;
    }

    public void a(int i4, w wVar, String str, Bundle bundle) {
    }
}
