package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public abstract class RenderingFormat {
    public static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat HTML;
    public static final RenderingFormat PLAIN;

    public final class HTML extends RenderingFormat {
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public final String escape(String str) {
            str.getClass();
            return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "<", "&lt;"), ">", "&gt;");
        }
    }

    public final class PLAIN extends RenderingFormat {
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public final String escape(String str) {
            str.getClass();
            return str;
        }
    }

    static {
        PLAIN plain = new PLAIN("PLAIN", 0, null);
        PLAIN = plain;
        HTML html = new HTML("HTML", 1, null);
        HTML = html;
        $VALUES = new RenderingFormat[]{plain, html};
    }

    public RenderingFormat(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) $VALUES.clone();
    }

    public abstract String escape(String str);
}
