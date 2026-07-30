package kotlin.enums;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class a {
    public static final <E extends Enum<E>> a6.a enumEntries(f6.a entriesProvider) {
        s.checkNotNullParameter(entriesProvider, "entriesProvider");
        return new EnumEntriesList((Enum[]) entriesProvider.invoke());
    }

    public static final <E extends Enum<E>> a6.a enumEntries(E[] entries) {
        s.checkNotNullParameter(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
