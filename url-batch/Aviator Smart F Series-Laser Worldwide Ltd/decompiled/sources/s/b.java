package s;

import cn.hutool.core.codec.PercentCodec;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.k0;
import cn.hutool.core.convert.d;
import cn.hutool.core.map.TableMap;
import cn.hutool.core.map.h1;
import cn.hutool.core.net.URLDecoder;
import cn.hutool.core.net.k;
import cn.hutool.core.text.l;
import com.baidu.ar.util.SystemInfoUtil;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class b {
    private final boolean isFormUrlEncoded;
    private boolean isStrict;
    private final TableMap<CharSequence, CharSequence> query;

    public b() {
        this((Map<? extends CharSequence, ?>) null);
    }

    private void addParam(String str, String str2, Charset charset) {
        if (str != null) {
            this.query.put(URLDecoder.decode(str, charset, this.isFormUrlEncoded), l.nullToEmpty(URLDecoder.decode(str2, charset, this.isFormUrlEncoded)));
        } else if (str2 != null) {
            this.query.put(URLDecoder.decode(str2, charset, this.isFormUrlEncoded), null);
        }
    }

    private b doParse(String str, Charset charset) {
        int length = str.length();
        int i8 = 0;
        String str2 = null;
        int i9 = 0;
        while (i8 < length) {
            char charAt = str.charAt(i8);
            if (charAt == '&') {
                addParam(str2, str.substring(i9, i8), charset);
                int i10 = i8 + 4;
                if (i10 < length && "amp;".equals(str.substring(i8 + 1, i8 + 5))) {
                    i8 = i10;
                }
                i9 = i8 + 1;
                str2 = null;
            } else if (charAt == '=' && str2 == null) {
                str2 = str.substring(i9, i8);
                i9 = i8 + 1;
            }
            i8++;
        }
        addParam(str2, str.substring(i9, i8), charset);
        return this;
    }

    public static b of(Map<? extends CharSequence, ?> map) {
        return new b(map);
    }

    private static String toStr(Object obj) {
        return obj instanceof Iterable ? CollUtil.join((Iterable) obj, SystemInfoUtil.COMMA) : obj instanceof Iterator ? k0.join((Iterator) obj, SystemInfoUtil.COMMA) : d.toStr(obj);
    }

    public b add(CharSequence charSequence, Object obj) {
        this.query.put(charSequence, toStr(obj));
        return this;
    }

    public b addAll(Map<? extends CharSequence, ?> map) {
        if (h1.isNotEmpty(map)) {
            map.forEach(new BiConsumer() { // from class: s.a
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    b.this.add((CharSequence) obj, obj2);
                }
            });
        }
        return this;
    }

    public String build(Charset charset) {
        return build(charset, true);
    }

    public CharSequence get(CharSequence charSequence) {
        if (h1.isEmpty(this.query)) {
            return null;
        }
        return this.query.get(charSequence);
    }

    public Map<CharSequence, CharSequence> getQueryMap() {
        return h1.unmodifiable(this.query);
    }

    public b parse(String str, Charset charset) {
        return parse(str, charset, true);
    }

    public b setStrict(boolean z7) {
        this.isStrict = z7;
        return this;
    }

    public String toString() {
        return build(null);
    }

    public b(boolean z7) {
        this(null, z7);
    }

    public static b of(Map<? extends CharSequence, ?> map, boolean z7) {
        return new b(map, z7);
    }

    public String build(Charset charset, boolean z7) {
        if (!this.isFormUrlEncoded) {
            return this.isStrict ? build(k.QUERY_PARAM_NAME_STRICT, k.QUERY_PARAM_VALUE_STRICT, charset, z7) : build(k.QUERY_PARAM_NAME, k.QUERY_PARAM_VALUE, charset, z7);
        }
        PercentCodec percentCodec = cn.hutool.core.net.a.ALL;
        return build(percentCodec, percentCodec, charset, z7);
    }

    public b parse(String str, Charset charset, boolean z7) {
        int indexOf;
        if (l.isBlank(str)) {
            return this;
        }
        if (z7 && (indexOf = str.indexOf(63)) > -1) {
            str = l.subSuf(str, indexOf + 1);
            if (l.isBlank(str)) {
                return this;
            }
        }
        return doParse(str, charset);
    }

    public b(Map<? extends CharSequence, ?> map) {
        this(map, false);
    }

    public static b of(String str, Charset charset) {
        return of(str, charset, true);
    }

    public b(Map<? extends CharSequence, ?> map, boolean z7) {
        if (h1.isNotEmpty(map)) {
            this.query = new TableMap<>(map.size());
            addAll(map);
        } else {
            this.query = new TableMap<>(16);
        }
        this.isFormUrlEncoded = z7;
    }

    public static b of(String str, Charset charset, boolean z7) {
        return of(str, charset, z7, false);
    }

    public static b of(String str, Charset charset, boolean z7, boolean z8) {
        return new b(z8).parse(str, charset, z7);
    }

    public String build(PercentCodec percentCodec, PercentCodec percentCodec2, Charset charset) {
        return build(percentCodec, percentCodec2, charset, true);
    }

    public String build(PercentCodec percentCodec, PercentCodec percentCodec2, Charset charset, boolean z7) {
        if (h1.isEmpty(this.query)) {
            return "";
        }
        char[] cArr = z7 ? null : new char[]{'%'};
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<CharSequence, CharSequence>> it = this.query.iterator();
        while (it.hasNext()) {
            Map.Entry<CharSequence, CharSequence> next = it.next();
            CharSequence key = next.getKey();
            if (key != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(percentCodec.encode(key, charset, cArr));
                CharSequence value = next.getValue();
                if (value != null) {
                    sb.append("=");
                    sb.append(percentCodec2.encode(value, charset, cArr));
                }
            }
        }
        return sb.toString();
    }
}
