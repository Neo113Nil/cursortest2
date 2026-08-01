package com.onesignal.inAppMessages.internal.prompt.impl;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    private boolean prompted;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        private static final /* synthetic */ od.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PERMISSION_GRANTED = new a("PERMISSION_GRANTED", 0);
        public static final a PERMISSION_DENIED = new a("PERMISSION_DENIED", 1);
        public static final a LOCATION_PERMISSIONS_MISSING_MANIFEST = new a("LOCATION_PERMISSIONS_MISSING_MANIFEST", 2);
        public static final a ERROR = new a("ERROR", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{PERMISSION_GRANTED, PERMISSION_DENIED, LOCATION_PERMISSIONS_MISSING_MANIFEST, ERROR};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = i7.a.J($values);
        }

        private a(String str, int i3) {
        }

        public static od.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(ld.a aVar);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z10) {
        this.prompted = z10;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
