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
    private final l reflectionAccessors = new l();
    private final SparseArray<m> flutterIdToOrigin = new SparseArray<>();
    private final Map<m, Integer> originToFlutterId = new HashMap();
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
        Long l7;
        int i2;
        for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
            l lVar = this.reflectionAccessors;
            Method method = lVar.f5911f;
            Field field = lVar.f5910e;
            Method method2 = lVar.f5909d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l7 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i5));
                    } catch (IllegalAccessException e7) {
                        Log.w(TAG, "Failed to access getChildId method.", e7);
                    } catch (InvocationTargetException e8) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e8);
                    }
                } else {
                    try {
                        l7 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i5));
                        l7.getClass();
                    } catch (ArrayIndexOutOfBoundsException e9) {
                        e = e9;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l7 = null;
                        if (l7 == null) {
                        }
                    } catch (IllegalAccessException e10) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e10);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l7 = null;
                        if (l7 == null) {
                        }
                    }
                }
                if (l7 == null) {
                    int longValue = (int) (l7.longValue() >> 32);
                    m mVar = new m(view, longValue);
                    if (this.originToFlutterId.containsKey(mVar)) {
                        i2 = this.originToFlutterId.get(mVar).intValue();
                    } else {
                        int i7 = this.nextFlutterId;
                        this.nextFlutterId = i7 + 1;
                        cacheVirtualIdMappings(view, longValue, i7);
                        i2 = i7;
                    }
                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i2);
                }
            }
            l7 = null;
            if (l7 == null) {
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i2, int i5) {
        m mVar = new m(view, i2);
        this.originToFlutterId.put(mVar, Integer.valueOf(i5));
        this.flutterIdToOrigin.put(i5, mVar);
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
        Long l7;
        Method method = this.reflectionAccessors.f5907b;
        if (method != null) {
            try {
                l7 = (Long) method.invoke(accessibilityNodeInfo, null);
                l7.getClass();
            } catch (IllegalAccessException e7) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e7);
            } catch (InvocationTargetException e8) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e8);
            }
            if (l7 != null) {
                return;
            }
            Integer num = this.originToFlutterId.get(new m(view, (int) (l7.longValue() >> 32)));
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
            if (l.b(readLong, 0)) {
                obtain2.readInt();
            }
            if (l.b(readLong, 1)) {
                obtain2.readLong();
            }
            if (l.b(readLong, 2)) {
                obtain2.readInt();
            }
            r1 = l.b(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
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

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return null;
        }
        View view = mVar.f5912a;
        if (!this.embeddedViewToDisplayBounds.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(mVar.f5913b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a7 = l.a(this.reflectionAccessors, accessibilityRecord);
        if (a7 == null) {
            return null;
        }
        return this.originToFlutterId.get(new m(view, (int) (a7.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo getRootNode(View view, int i2, Rect rect) {
        Long l7;
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f5906a;
        if (method != null) {
            try {
                l7 = (Long) method.invoke(createAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e7) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e7);
            } catch (InvocationTargetException e8) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e8);
            }
            if (l7 != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l7.longValue() >> 32), i2);
            return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
        }
        l7 = null;
        if (l7 != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i2, MotionEvent motionEvent) {
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return false;
        }
        View view = mVar.f5912a;
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i5] = pointerProperties;
            motionEvent.getPointerProperties(i5, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i5, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i5] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i2, int i5, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null || (accessibilityNodeProvider = mVar.f5912a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(mVar.f5913b, i5, bundle);
    }

    public View platformViewOfNode(int i2) {
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return null;
        }
        return mVar.f5912a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a7 = l.a(this.reflectionAccessors, accessibilityEvent);
        if (a7 != null) {
            int longValue = (int) (a7.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new m(view, longValue));
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
            for (int i5 = 0; i5 < obtain.getRecordCount(); i5++) {
                AccessibilityRecord record = obtain.getRecord(i5);
                Long a8 = l.a(this.reflectionAccessors, record);
                if (a8 != null) {
                    m mVar = new m(view, (int) (a8.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(mVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(mVar).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
        }
        return false;
    }
}
