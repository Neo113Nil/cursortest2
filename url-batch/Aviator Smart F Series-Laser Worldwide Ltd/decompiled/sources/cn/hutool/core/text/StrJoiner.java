package cn.hutool.core.text;

import cn.hutool.core.collection.ArrayIter;
import cn.hutool.core.collection.k0;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.util.e0;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Function;

/* loaded from: classes.dex */
public class StrJoiner implements Appendable, Serializable {
    private static final long serialVersionUID = 1;
    private Appendable appendable;
    private CharSequence delimiter;
    private String emptyResult;
    private boolean hasContent;
    private NullMode nullMode;
    private CharSequence prefix;
    private CharSequence suffix;
    private boolean wrapElement;

    public enum NullMode {
        IGNORE,
        TO_EMPTY,
        NULL_STRING
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$cn$hutool$core$text$StrJoiner$NullMode;

        static {
            int[] iArr = new int[NullMode.values().length];
            $SwitchMap$cn$hutool$core$text$StrJoiner$NullMode = iArr;
            try {
                iArr[NullMode.IGNORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$hutool$core$text$StrJoiner$NullMode[NullMode.TO_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$hutool$core$text$StrJoiner$NullMode[NullMode.NULL_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public StrJoiner(CharSequence charSequence) {
        this(null, charSequence);
    }

    private void checkHasContent(Appendable appendable) {
        if (appendable instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) appendable;
            if (charSequence.length() <= 0 || !l.endWith(charSequence, this.delimiter)) {
                return;
            }
            this.hasContent = true;
            return;
        }
        String obj = appendable.toString();
        if (!l.isNotEmpty(obj) || l.endWith(obj, this.delimiter)) {
            return;
        }
        this.hasContent = true;
    }

    public static StrJoiner of(StrJoiner strJoiner) {
        StrJoiner strJoiner2 = new StrJoiner(strJoiner.delimiter, strJoiner.prefix, strJoiner.suffix);
        strJoiner2.wrapElement = strJoiner.wrapElement;
        strJoiner2.nullMode = strJoiner.nullMode;
        strJoiner2.emptyResult = strJoiner.emptyResult;
        return strJoiner2;
    }

    private Appendable prepare() {
        if (this.hasContent) {
            this.appendable.append(this.delimiter);
        } else {
            if (this.appendable == null) {
                this.appendable = new StringBuilder();
            }
            if (!this.wrapElement && l.isNotEmpty(this.prefix)) {
                this.appendable.append(this.prefix);
            }
            this.hasContent = true;
        }
        return this.appendable;
    }

    public int length() {
        Appendable appendable = this.appendable;
        if (appendable != null) {
            return appendable.toString().length() + this.suffix.length();
        }
        String str = this.emptyResult;
        if (str == null) {
            return -1;
        }
        return str.length();
    }

    public StrJoiner merge(StrJoiner strJoiner) {
        if (strJoiner != null && strJoiner.appendable != null) {
            String strJoiner2 = strJoiner.toString();
            if (strJoiner.wrapElement) {
                append((CharSequence) strJoiner2);
            } else {
                append((CharSequence) strJoiner2, this.prefix.length(), strJoiner2.length());
            }
        }
        return this;
    }

    public StrJoiner setDelimiter(CharSequence charSequence) {
        this.delimiter = charSequence;
        return this;
    }

    public StrJoiner setEmptyResult(String str) {
        this.emptyResult = str;
        return this;
    }

    public StrJoiner setNullMode(NullMode nullMode) {
        this.nullMode = nullMode;
        return this;
    }

    public StrJoiner setPrefix(CharSequence charSequence) {
        this.prefix = charSequence;
        return this;
    }

    public StrJoiner setSuffix(CharSequence charSequence) {
        this.suffix = charSequence;
        return this;
    }

    public StrJoiner setWrapElement(boolean z7) {
        this.wrapElement = z7;
        return this;
    }

    public String toString() {
        Appendable appendable = this.appendable;
        if (appendable == null) {
            return this.emptyResult;
        }
        String obj = appendable.toString();
        if (this.wrapElement || !l.isNotEmpty(this.suffix)) {
            return obj;
        }
        return obj + ((Object) this.suffix);
    }

    public StrJoiner(Appendable appendable, CharSequence charSequence) {
        this(appendable, charSequence, null, null);
    }

    public StrJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this(null, charSequence, charSequence2, charSequence3);
    }

    public StrJoiner(Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.nullMode = NullMode.NULL_STRING;
        this.emptyResult = "";
        if (appendable != null) {
            this.appendable = appendable;
            checkHasContent(appendable);
        }
        this.delimiter = charSequence;
        this.prefix = charSequence2;
        this.suffix = charSequence3;
    }

    public StrJoiner append(Object obj) {
        if (obj == null) {
            append((CharSequence) null);
        } else if (cn.hutool.core.util.h.isArray(obj)) {
            append((Iterator) new ArrayIter(obj));
        } else if (obj instanceof Iterator) {
            append((Iterator) obj);
        } else if (obj instanceof Iterable) {
            append(((Iterable) obj).iterator());
        } else {
            append((CharSequence) e0.toString(obj));
        }
        return this;
    }

    public static StrJoiner of(CharSequence charSequence) {
        return new StrJoiner(charSequence);
    }

    public static StrJoiner of(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new StrJoiner(charSequence, charSequence2, charSequence3);
    }

    public <T> StrJoiner append(T[] tArr) {
        return tArr == null ? this : append((Iterator) new ArrayIter((Object[]) tArr));
    }

    public <T> StrJoiner append(Iterator<T> it) {
        if (it != null) {
            while (it.hasNext()) {
                append(it.next());
            }
        }
        return this;
    }

    public <T> StrJoiner append(T[] tArr, Function<T, ? extends CharSequence> function) {
        return append((Iterator) new ArrayIter((Object[]) tArr), (Function) function);
    }

    public <E> StrJoiner append(Iterable<E> iterable, Function<? super E, ? extends CharSequence> function) {
        return append(k0.getIter((Iterable) iterable), function);
    }

    public <E> StrJoiner append(Iterator<E> it, Function<? super E, ? extends CharSequence> function) {
        Object apply;
        if (it != null) {
            while (it.hasNext()) {
                apply = function.apply(it.next());
                append((CharSequence) apply);
            }
        }
        return this;
    }

    @Override // java.lang.Appendable
    public StrJoiner append(CharSequence charSequence) {
        return append(charSequence, 0, l.length(charSequence));
    }

    @Override // java.lang.Appendable
    public StrJoiner append(CharSequence charSequence, int i8, int i9) {
        if (charSequence == null) {
            int i10 = a.$SwitchMap$cn$hutool$core$text$StrJoiner$NullMode[this.nullMode.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 == 2) {
                charSequence = "";
            } else if (i10 == 3) {
                charSequence = "null";
                i9 = 4;
            }
        }
        try {
            Appendable prepare = prepare();
            if (this.wrapElement && l.isNotEmpty(this.prefix)) {
                prepare.append(this.prefix);
            }
            prepare.append(charSequence, i8, i9);
            if (this.wrapElement && l.isNotEmpty(this.suffix)) {
                prepare.append(this.suffix);
            }
            return this;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    @Override // java.lang.Appendable
    public StrJoiner append(char c8) {
        return append((CharSequence) String.valueOf(c8));
    }
}
