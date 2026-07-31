package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes11.dex */
public class AccessibilityRecordCompat {
    private final AccessibilityRecord mRecord;

    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return accessibilityRecordCompat.mRecord == null;
        }
        return accessibilityRecord.equals(accessibilityRecordCompat.mRecord);
    }
}
