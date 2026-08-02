package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmg {
    public final Object a;
    public int b;
    public Object c;

    public kmg(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Appendable, java.lang.Object] */
    public final void a(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e) {
            throw new ac(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void b(Format format, Object obj) {
        if (this.c == null) {
            a(format.format(obj));
            return;
        }
        AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        ?? r0 = this.a;
        try {
            int beginIndex = formatToCharacterIterator.getBeginIndex();
            int endIndex = formatToCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                r0.append(formatToCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        r0.append(formatToCharacterIterator.next());
                    }
                }
            }
            this.b = i2 + i;
            formatToCharacterIterator.first();
            int index = formatToCharacterIterator.getIndex();
            int endIndex2 = formatToCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = formatToCharacterIterator.getAttributes();
                int runLimit = formatToCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.c.add(new tf(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                formatToCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new ac(e);
        }
    }

    public final void c(Format format, Object obj, String str) {
        if (this.c != null || str == null) {
            b(format, obj);
        } else {
            a(str);
        }
    }

    public kmg(Object obj) {
        this.a = obj;
    }

    public kmg(StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
        this.c = null;
    }
}
