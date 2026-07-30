package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final m reflectionAccessors = new m();
    private final SparseArray<n> flutterIdToOrigin = new SparseArray<>();
    private final Map<n, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l2;
        int i2;
        for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
            m mVar = this.reflectionAccessors;
            Method method = mVar.f630f;
            Field field = mVar.f629e;
            Method method2 = mVar.f628d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l2 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i3));
                    } catch (IllegalAccessException e2) {
                        Log.w(TAG, "Failed to access getChildId method.", e2);
                    } catch (InvocationTargetException e3) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e3);
                    }
                } else {
                    try {
                        l2 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i3));
                        l2.getClass();
                    } catch (ArrayIndexOutOfBoundsException e4) {
                        e = e4;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l2 = null;
                        if (l2 == null) {
                        }
                    } catch (IllegalAccessException e5) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e5);
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l2 = null;
                        if (l2 == null) {
                        }
                    }
                }
                if (l2 == null) {
                    int longValue = (int) (l2.longValue() >> 32);
                    n nVar = new n(view, longValue);
                    if (this.originToFlutterId.containsKey(nVar)) {
                        i2 = this.originToFlutterId.get(nVar).intValue();
                    } else {
                        int i4 = this.nextFlutterId;
                        this.nextFlutterId = i4 + 1;
                        cacheVirtualIdMappings(view, longValue, i4);
                        i2 = i4;
                    }
                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i2);
                }
            }
            l2 = null;
            if (l2 == null) {
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i2, int i3) {
        n nVar = new n(view, i2);
        this.originToFlutterId.put(nVar, Integer.valueOf(i3));
        this.flutterIdToOrigin.put(i3, nVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i2, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i2);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i2);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
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
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (Build.VERSION.SDK_INT >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l2;
        Method method = this.reflectionAccessors.f626b;
        if (method != null) {
            try {
                l2 = (Long) method.invoke(accessibilityNodeInfo, null);
                l2.getClass();
            } catch (IllegalAccessException e2) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e2);
            } catch (InvocationTargetException e3) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e3);
            }
            if (l2 != null) {
                return;
            }
            Integer num = this.originToFlutterId.get(new n(view, (int) (l2.longValue() >> 32)));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
        } else {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m.b(readLong, 0)) {
                obtain2.readInt();
            }
            if (m.b(readLong, 1)) {
                obtain2.readLong();
            }
            if (m.b(readLong, 2)) {
                obtain2.readInt();
            }
            r1 = m.b(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
        }
        l2 = r1;
        if (l2 != null) {
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

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        n nVar = this.flutterIdToOrigin.get(i2);
        if (nVar == null) {
            return null;
        }
        View view = nVar.f631a;
        if (!this.embeddedViewToDisplayBounds.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(nVar.f632b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a2 = m.a(this.reflectionAccessors, accessibilityRecord);
        if (a2 == null) {
            return null;
        }
        return this.originToFlutterId.get(new n(view, (int) (a2.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo getRootNode(View view, int i2, Rect rect) {
        Long l2;
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f625a;
        if (method != null) {
            try {
                l2 = (Long) method.invoke(createAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e2) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e2);
            } catch (InvocationTargetException e3) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e3);
            }
            if (l2 != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l2.longValue() >> 32), i2);
            return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
        }
        l2 = null;
        if (l2 != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i2, MotionEvent motionEvent) {
        n nVar = this.flutterIdToOrigin.get(i2);
        if (nVar == null) {
            return false;
        }
        View view = nVar.f631a;
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i3] = pointerProperties;
            motionEvent.getPointerProperties(i3, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i3, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i3] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        n nVar = this.flutterIdToOrigin.get(i2);
        if (nVar == null || (accessibilityNodeProvider = nVar.f631a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(nVar.f632b, i3, bundle);
    }

    public View platformViewOfNode(int i2) {
        n nVar = this.flutterIdToOrigin.get(i2);
        if (nVar == null) {
            return null;
        }
        return nVar.f631a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a2 = m.a(this.reflectionAccessors, accessibilityEvent);
        if (a2 != null) {
            int longValue = (int) (a2.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new n(view, longValue));
            if (num == null) {
                int i2 = this.nextFlutterId;
                this.nextFlutterId = i2 + 1;
                Integer valueOf = Integer.valueOf(i2);
                cacheVirtualIdMappings(view, longValue, i2);
                num = valueOf;
            }
            obtain.setSource(this.rootAccessibilityView, num.intValue());
            obtain.setClassName(accessibilityEvent.getClassName());
            obtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i3 = 0; i3 < obtain.getRecordCount(); i3++) {
                AccessibilityRecord record = obtain.getRecord(i3);
                Long a3 = m.a(this.reflectionAccessors, record);
                if (a3 != null) {
                    n nVar = new n(view, (int) (a3.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(nVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(nVar).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
        }
        return false;
    }
}
