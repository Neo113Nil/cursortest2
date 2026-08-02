package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h extends Format.Field {
    public static final h a = new h();
    private static final long serialVersionUID = 7510380454602616157L;

    protected h() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() {
        if (getClass() != h.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        String name = getName();
        h hVar = a;
        if (name.equals(hVar.getName())) {
            return hVar;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}
