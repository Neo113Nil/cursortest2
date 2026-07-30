package cn.hutool.core.io.watch;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OVERFLOW' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class WatchKind {
    private static final /* synthetic */ WatchKind[] $VALUES;
    public static final WatchEvent.Kind<?>[] ALL;
    public static final WatchKind CREATE;
    public static final WatchKind DELETE;
    public static final WatchKind MODIFY;
    public static final WatchKind OVERFLOW;
    private final WatchEvent.Kind<?> value;

    static {
        WatchEvent.Kind kind;
        WatchEvent.Kind kind2;
        WatchEvent.Kind kind3;
        WatchEvent.Kind kind4;
        kind = StandardWatchEventKinds.OVERFLOW;
        WatchKind watchKind = new WatchKind("OVERFLOW", 0, kind);
        OVERFLOW = watchKind;
        kind2 = StandardWatchEventKinds.ENTRY_MODIFY;
        WatchKind watchKind2 = new WatchKind("MODIFY", 1, kind2);
        MODIFY = watchKind2;
        kind3 = StandardWatchEventKinds.ENTRY_CREATE;
        WatchKind watchKind3 = new WatchKind("CREATE", 2, kind3);
        CREATE = watchKind3;
        kind4 = StandardWatchEventKinds.ENTRY_DELETE;
        WatchKind watchKind4 = new WatchKind(HttpManager.HTTP_DELETE, 3, kind4);
        DELETE = watchKind4;
        $VALUES = new WatchKind[]{watchKind, watchKind2, watchKind3, watchKind4};
        ALL = new WatchEvent.Kind[]{watchKind.getValue(), watchKind2.getValue(), watchKind3.getValue(), watchKind4.getValue()};
    }

    private WatchKind(String str, int i8, WatchEvent.Kind kind) {
        this.value = kind;
    }

    public static WatchKind valueOf(String str) {
        return (WatchKind) Enum.valueOf(WatchKind.class, str);
    }

    public static WatchKind[] values() {
        return (WatchKind[]) $VALUES.clone();
    }

    public WatchEvent.Kind<?> getValue() {
        return this.value;
    }
}
