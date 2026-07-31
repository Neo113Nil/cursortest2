package io.flutter.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f17829a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f17830b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f17831c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f17832d;

        /* renamed from: e, reason: collision with root package name */
        private final Field f17833e;

        /* renamed from: f, reason: collision with root package name */
        private final Method f17834f;

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"DiscouragedPrivateApi,PrivateApi"})
        private b() {
            Method method;
            Method method2;
            Method method3;
            Field field;
            Field declaredField;
            Method method4;
            Method method5;
            Field field2;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z4.b.f(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                z4.b.f(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    z4.b.f(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    field = null;
                }
                this.f17829a = method;
                this.f17830b = method6;
                this.f17831c = method2;
                this.f17832d = method3;
                this.f17833e = declaredField;
                this.f17834f = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                z4.b.f(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                field2 = null;
            } catch (NoSuchMethodException unused5) {
                z4.b.f(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method3 = null;
                field2 = null;
            }
            method6 = method5;
            field = field2;
            declaredField = field;
            method4 = field;
            this.f17829a = method;
            this.f17830b = method6;
            this.f17831c = method2;
            this.f17832d = method3;
            this.f17833e = declaredField;
            this.f17834f = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i7) {
            String str;
            Method method = this.f17832d;
            if (method == null && (this.f17833e == null || this.f17834f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i7));
                } catch (IllegalAccessException e7) {
                    e = e7;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e8) {
                    e = e8;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f17834f.invoke(this.f17833e.get(accessibilityNodeInfo), Integer.valueOf(i7))).longValue());
                } catch (ArrayIndexOutOfBoundsException e9) {
                    e = e9;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e10) {
                    e = e10;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e11) {
                    e = e11;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f17830b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e7) {
                    e = e7;
                    str = "Failed to access getParentNodeId method.";
                    z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                } catch (InvocationTargetException e8) {
                    e = e8;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                }
            }
            return l(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f17831c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e7) {
                e = e7;
                str = "Failed to access the getRecordSourceNodeId method.";
                z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e8) {
                e = e8;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f17829a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e7) {
                e = e7;
                str = "Failed to access getSourceNodeId method.";
                z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e8) {
                e = e8;
                str = "The getSourceNodeId method threw an exception when invoked.";
                z4.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int j(long j7) {
            return (int) (j7 >> 32);
        }

        private static boolean k(long j7, int i7) {
            return (j7 & (1 << i7)) != 0;
        }

        private static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                z4.b.f(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final View f17835a;

        /* renamed from: b, reason: collision with root package name */
        final int f17836b;

        private c(View view, int i7) {
            this.f17835a = view;
            this.f17836b = i7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f17836b == cVar.f17836b && this.f17835a.equals(cVar.f17835a);
        }

        public int hashCode() {
            return ((this.f17835a.hashCode() + 31) * 31) + this.f17836b;
        }
    }

    AccessibilityViewEmbedder(View view, int i7) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i7;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i7;
        for (int i8 = 0; i8 < accessibilityNodeInfo.getChildCount(); i8++) {
            Long f7 = this.reflectionAccessors.f(accessibilityNodeInfo, i8);
            if (f7 != null) {
                int j7 = b.j(f7.longValue());
                c cVar = new c(view, j7);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i7 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i9 = this.nextFlutterId;
                    this.nextFlutterId = i9 + 1;
                    cacheVirtualIdMappings(view, j7, i9);
                    i7 = i9;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i7);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i7, int i8) {
        c cVar = new c(view, i7);
        this.originToFlutterId.put(cVar, Integer.valueOf(i8));
        this.flutterIdToOrigin.put(i8, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i7, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i7);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i7);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (i7 >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (i7 >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (i7 >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (i7 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i7 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long g7 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (g7 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(g7.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f17835a) || cVar.f17835a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f17835a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f17836b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, cVar.f17835a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long h7 = this.reflectionAccessors.h(accessibilityRecord);
        if (h7 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(h7.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i7, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long i8 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (i8 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(i8.longValue()), i7);
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, view);
    }

    public boolean onAccessibilityHoverEvent(int i7, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f17835a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
            pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i8, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i8, pointerCoords);
            pointerCoordsArr[i8] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i8].x -= rect.left;
            pointerCoordsArr[i8].y -= rect.top;
        }
        return cVar.f17835a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i7, int i8, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null || (accessibilityNodeProvider = cVar.f17835a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f17836b, i8, bundle);
    }

    public View platformViewOfNode(int i7) {
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null) {
            return null;
        }
        return cVar.f17835a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long h7 = this.reflectionAccessors.h(accessibilityEvent);
        if (h7 == null) {
            return false;
        }
        int j7 = b.j(h7.longValue());
        Integer num = this.originToFlutterId.get(new c(view, j7));
        if (num == null) {
            int i7 = this.nextFlutterId;
            this.nextFlutterId = i7 + 1;
            num = Integer.valueOf(i7);
            cacheVirtualIdMappings(view, j7, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i8 = 0; i8 < obtain.getRecordCount(); i8++) {
            AccessibilityRecord record = obtain.getRecord(i8);
            Long h8 = this.reflectionAccessors.h(record);
            if (h8 == null) {
                return false;
            }
            c cVar = new c(view, b.j(h8.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
