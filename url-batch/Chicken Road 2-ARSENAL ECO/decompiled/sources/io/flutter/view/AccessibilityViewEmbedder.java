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

/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final m reflectionAccessors = new m();
    private final SparseArray<n> flutterIdToOrigin = new SparseArray<>();
    private final Map<n, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i7) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l7;
        int i7;
        for (int i8 = 0; i8 < accessibilityNodeInfo.getChildCount(); i8++) {
            m mVar = this.reflectionAccessors;
            Method method = mVar.f4728f;
            Field field = mVar.f4727e;
            Method method2 = mVar.f4726d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l7 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i8));
                    } catch (IllegalAccessException e4) {
                        Log.w(TAG, "Failed to access getChildId method.", e4);
                    } catch (InvocationTargetException e7) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e7);
                    }
                } else {
                    try {
                        l7 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i8));
                        l7.getClass();
                    } catch (ArrayIndexOutOfBoundsException e8) {
                        e = e8;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l7 = null;
                        if (l7 == null) {
                        }
                    } catch (IllegalAccessException e9) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e9);
                    } catch (InvocationTargetException e10) {
                        e = e10;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l7 = null;
                        if (l7 == null) {
                        }
                    }
                }
                if (l7 == null) {
                    int longValue = (int) (l7.longValue() >> 32);
                    n nVar = new n(view, longValue);
                    if (this.originToFlutterId.containsKey(nVar)) {
                        i7 = this.originToFlutterId.get(nVar).intValue();
                    } else {
                        int i9 = this.nextFlutterId;
                        this.nextFlutterId = i9 + 1;
                        cacheVirtualIdMappings(view, longValue, i9);
                        i7 = i9;
                    }
                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i7);
                }
            }
            l7 = null;
            if (l7 == null) {
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i7, int i8) {
        n nVar = new n(view, i7);
        this.originToFlutterId.put(nVar, Integer.valueOf(i8));
        this.flutterIdToOrigin.put(i8, nVar);
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
        Long l7;
        Method method = this.reflectionAccessors.f4724b;
        if (method != null) {
            try {
                l7 = (Long) method.invoke(accessibilityNodeInfo, null);
                l7.getClass();
            } catch (IllegalAccessException e4) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e4);
            } catch (InvocationTargetException e7) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e7);
            }
            if (l7 != null) {
                return;
            }
            Integer num = this.originToFlutterId.get(new n(view, (int) (l7.longValue() >> 32)));
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
        l7 = r1;
        if (l7 != null) {
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
        n nVar = this.flutterIdToOrigin.get(i7);
        if (nVar == null) {
            return null;
        }
        View view = nVar.f4729a;
        if (!this.embeddedViewToDisplayBounds.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(nVar.f4730b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a7 = m.a(this.reflectionAccessors, accessibilityRecord);
        if (a7 == null) {
            return null;
        }
        return this.originToFlutterId.get(new n(view, (int) (a7.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo getRootNode(View view, int i7, Rect rect) {
        Long l7;
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f4723a;
        if (method != null) {
            try {
                l7 = (Long) method.invoke(createAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e4) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e4);
            } catch (InvocationTargetException e7) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e7);
            }
            if (l7 != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l7.longValue() >> 32), i7);
            return convertToFlutterNode(createAccessibilityNodeInfo, i7, view);
        }
        l7 = null;
        if (l7 != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i7, MotionEvent motionEvent) {
        n nVar = this.flutterIdToOrigin.get(i7);
        if (nVar == null) {
            return false;
        }
        View view = nVar.f4729a;
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i8] = pointerProperties;
            motionEvent.getPointerProperties(i8, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i8, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i8] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i7, int i8, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        n nVar = this.flutterIdToOrigin.get(i7);
        if (nVar == null || (accessibilityNodeProvider = nVar.f4729a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(nVar.f4730b, i8, bundle);
    }

    public View platformViewOfNode(int i7) {
        n nVar = this.flutterIdToOrigin.get(i7);
        if (nVar == null) {
            return null;
        }
        return nVar.f4729a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a7 = m.a(this.reflectionAccessors, accessibilityEvent);
        if (a7 != null) {
            int longValue = (int) (a7.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new n(view, longValue));
            if (num == null) {
                int i7 = this.nextFlutterId;
                this.nextFlutterId = i7 + 1;
                Integer valueOf = Integer.valueOf(i7);
                cacheVirtualIdMappings(view, longValue, i7);
                num = valueOf;
            }
            obtain.setSource(this.rootAccessibilityView, num.intValue());
            obtain.setClassName(accessibilityEvent.getClassName());
            obtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i8 = 0; i8 < obtain.getRecordCount(); i8++) {
                AccessibilityRecord record = obtain.getRecord(i8);
                Long a8 = m.a(this.reflectionAccessors, record);
                if (a8 != null) {
                    n nVar = new n(view, (int) (a8.longValue() >> 32));
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
