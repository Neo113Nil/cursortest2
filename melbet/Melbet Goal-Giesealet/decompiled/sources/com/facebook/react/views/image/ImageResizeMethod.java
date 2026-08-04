package com.facebook.react.views.image;

import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageResizeMethod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMethod;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "RESIZE", "SCALE", "NONE", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageResizeMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageResizeMethod[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ImageResizeMethod AUTO = new ImageResizeMethod("AUTO", 0);
    public static final ImageResizeMethod RESIZE = new ImageResizeMethod("RESIZE", 1);
    public static final ImageResizeMethod SCALE = new ImageResizeMethod("SCALE", 2);
    public static final ImageResizeMethod NONE = new ImageResizeMethod("NONE", 3);

    private static final /* synthetic */ ImageResizeMethod[] $values() {
        return new ImageResizeMethod[]{AUTO, RESIZE, SCALE, NONE};
    }

    public static EnumEntries<ImageResizeMethod> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static final ImageResizeMethod parse(String str) {
        return INSTANCE.parse(str);
    }

    private ImageResizeMethod(String str, int i) {
    }

    static {
        ImageResizeMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ImageResizeMethod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMethod$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/views/image/ImageResizeMethod;", ViewProps.RESIZE_METHOD, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        
            if (r3.equals("auto") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        
            if (r3.equals("") == false) goto L31;
         */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ImageResizeMethod parse(String resizeMethod) {
            if (resizeMethod != null) {
                int hashCode = resizeMethod.hashCode();
                if (hashCode != -934437708) {
                    if (hashCode != 0) {
                        if (hashCode != 3005871) {
                            if (hashCode != 3387192) {
                                if (hashCode == 109250890 && resizeMethod.equals("scale")) {
                                    return ImageResizeMethod.SCALE;
                                }
                            } else if (resizeMethod.equals(ViewProps.NONE)) {
                                return ImageResizeMethod.NONE;
                            }
                        }
                    }
                } else if (resizeMethod.equals("resize")) {
                    return ImageResizeMethod.RESIZE;
                }
                FLog.w(ReactConstants.TAG, "Invalid resize method: '" + resizeMethod + "'");
                return ImageResizeMethod.AUTO;
            }
            return ImageResizeMethod.AUTO;
        }
    }

    public static ImageResizeMethod valueOf(String str) {
        return (ImageResizeMethod) Enum.valueOf(ImageResizeMethod.class, str);
    }

    public static ImageResizeMethod[] values() {
        return (ImageResizeMethod[]) $VALUES.clone();
    }
}
