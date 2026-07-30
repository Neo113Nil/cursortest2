package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Class<E> f17041c;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(E[] entries) {
        s.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        s.checkNotNull(cls);
        this.f17041c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f17041c.getEnumConstants();
        s.checkNotNullExpressionValue(enumConstants, "c.enumConstants");
        return kotlin.enums.a.enumEntries(enumConstants);
    }
}
