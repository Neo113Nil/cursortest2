package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiu extends ixb {
    private static final jxv H;
    private static final jxf I;
    public static final Logger a = Logger.getLogger(kiu.class.getName());
    static final long b;
    public static final long c;
    public static final kjm d;
    static final Pattern e;
    public static final Method f;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    List E;
    public final kee F;
    kmf G = new kmf();
    public kjm g;
    public kjm h;
    public final List i;
    public kat j;
    final List k;
    public final String l;
    public String m;
    String n;
    jxv o;
    jxf p;
    public long q;
    int r;
    int s;
    long t;
    long u;
    public boolean v;
    jyl w;
    public Map x;
    boolean y;
    public boolean z;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = 1800000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        c = 1000L;
        d = new kmj(khd.n, 0);
        H = jxv.b;
        I = jxf.a;
        e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        Method method = null;
        try {
            Class<?> cls = Class.forName("kdy");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        f = method;
    }

    public kiu(SocketAddress socketAddress, String str, kee keeVar) {
        kjm kjmVar = d;
        this.g = kjmVar;
        this.h = kjmVar;
        this.i = new ArrayList();
        this.j = kat.b();
        this.k = new ArrayList();
        this.n = "pick_first";
        this.o = H;
        this.p = I;
        this.q = b;
        this.r = 5;
        this.s = 5;
        this.t = 16777216L;
        this.u = 1048576L;
        this.v = true;
        this.w = jyl.a;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = new ArrayList();
        this.l = l(socketAddress);
        this.F = keeVar;
        kat katVar = new kat();
        katVar.e(new kis(socketAddress, str));
        this.j = katVar;
        Iterator it = jxh.a().b().iterator();
        while (it.hasNext()) {
            ((jxg) it.next()).a();
        }
    }

    static String l(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", "/" + String.valueOf(socketAddress), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Map m(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            hoq.C(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, m((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, p((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Number) {
                linkedHashMap.put(str, Double.valueOf(((Number) value).doubleValue()));
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + String.valueOf(entry) + "' is of type '" + String.valueOf(value.getClass()) + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static kuq n(String str, kat katVar) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        kar a2 = uri != null ? katVar.a(uri.getScheme()) : null;
        if (a2 == null && !e.matcher(str).matches()) {
            try {
                URI uri2 = new URI(katVar.c(), "", a.ah(str, "/"), null);
                uri = uri2;
                a2 = katVar.a(uri2.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (a2 == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.aa(sb, " (", ")") : ""));
        }
        return new kuq(new kmv(uri), a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kuq o(String str, kat katVar) {
        int i;
        char c2;
        kbz kbzVar;
        kar a2;
        int i2;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                BitSet bitSet = kbz.a;
            } catch (URISyntaxException e2) {
                e = e2;
            }
        } catch (URISyntaxException e3) {
            e = e3;
            i = 0;
            c2 = 1;
        }
        try {
            kby kbyVar = new kby();
            int length = str.length();
            int i3 = 0;
            try {
                while (true) {
                    i2 = -1;
                    if (i3 < length) {
                        char charAt = str.charAt(i3);
                        if (charAt != ':') {
                            if (charAt == '/' || charAt == '?' || charAt == '#') {
                                break;
                            }
                            i3++;
                        }
                        break;
                    }
                    break;
                }
                break;
                if (i3 < 0) {
                    throw new IllegalArgumentException("Missing required scheme.");
                }
                kbyVar.e(str.substring(0, i3));
                int i4 = i3 + 1;
                int i5 = i3 + 2;
                if (i5 < length) {
                    c2 = 1;
                    try {
                        if (str.charAt(i4) == '/' && str.charAt(i5) == '/') {
                            int i6 = i3 + 3;
                            i4 = i6;
                            while (i4 < length) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 == '/' || charAt2 == '?' || charAt2 == '#') {
                                    break;
                                }
                                i4++;
                            }
                            String substring = str.substring(i6, i4);
                            if (substring == null) {
                                kbyVar.f();
                                kbyVar.b(null);
                                kbyVar.c();
                            } else {
                                int indexOf = substring.indexOf(64);
                                if (indexOf >= 0) {
                                    String substring2 = substring.substring(0, indexOf);
                                    i = 0;
                                    kbz.e(substring2, "userInfo", kbz.f, null);
                                    kbyVar.e = substring2;
                                } else {
                                    i = 0;
                                    kbyVar.f();
                                }
                                int i7 = indexOf >= 0 ? indexOf + 1 : i;
                                int length2 = substring.length() - 1;
                                while (true) {
                                    if (length2 >= i7) {
                                        char charAt3 = substring.charAt(length2);
                                        if (charAt3 == ':') {
                                            i2 = length2;
                                            break;
                                        }
                                        if (charAt3 != ']' && kbz.a.get(charAt3)) {
                                            length2--;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (i2 < 0) {
                                    kbyVar.d(substring.substring(i7));
                                    kbyVar.c();
                                } else {
                                    kbyVar.d(substring.substring(i7, i2));
                                    String substring3 = substring.substring(i2 + 1);
                                    if (substring3 != null && !substring3.isEmpty()) {
                                        try {
                                            Integer.parseInt(substring3);
                                        } catch (NumberFormatException e4) {
                                            throw new IllegalArgumentException("Invalid port", e4);
                                        }
                                    }
                                    kbyVar.g = substring3;
                                }
                            }
                        }
                        i = 0;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        throw new URISyntaxException(str, e.getMessage());
                    } catch (URISyntaxException e6) {
                        e = e6;
                        i = 0;
                        sb.append(e.getMessage());
                        kbzVar = null;
                        if (kbzVar != null) {
                        }
                        if (a2 == null) {
                            String c3 = katVar.c();
                            BitSet bitSet2 = kbz.a;
                            kby kbyVar2 = new kby();
                            kbyVar2.e(c3.toLowerCase(Locale.ROOT));
                            kbyVar2.b("");
                            kbyVar2.b = kbz.b("/".concat(String.valueOf(str)), kbz.h);
                            kbzVar = kbyVar2.a();
                            a2 = katVar.a(kbzVar.k);
                        }
                        if (a2 == null) {
                        }
                    }
                } else {
                    i = 0;
                    c2 = 1;
                }
                int i8 = i4;
                while (i8 < length) {
                    char charAt4 = str.charAt(i8);
                    if (charAt4 == '?' || charAt4 == '#') {
                        break;
                    }
                    i8++;
                }
                String substring4 = str.substring(i4, i8);
                hoq.y(substring4 != null ? c2 : i, "Path can be empty but not null");
                kbz.d(substring4, null);
                kbyVar.b = substring4;
                if (i8 < length && str.charAt(i8) == '?') {
                    int i9 = i8 + 1;
                    int i10 = i9;
                    while (i10 < length && str.charAt(i10) != '#') {
                        i10++;
                    }
                    String substring5 = str.substring(i9, i10);
                    if (substring5 != null) {
                        kbz.e(substring5, "query", kbz.i, null);
                    }
                    kbyVar.c = substring5;
                    i8 = i10;
                }
                if (i8 < length && str.charAt(i8) == '#') {
                    String substring6 = str.substring(i8 + 1);
                    if (substring6 != null) {
                        kbz.e(substring6, "fragment", kbz.j, null);
                    }
                    kbyVar.d = substring6;
                }
                kbzVar = kbyVar.a();
                a2 = kbzVar != null ? katVar.a(kbzVar.k) : null;
                if (a2 == null && !e.matcher(str).matches()) {
                    String c32 = katVar.c();
                    BitSet bitSet22 = kbz.a;
                    kby kbyVar22 = new kby();
                    kbyVar22.e(c32.toLowerCase(Locale.ROOT));
                    kbyVar22.b("");
                    kbyVar22.b = kbz.b("/".concat(String.valueOf(str)), kbz.h);
                    kbzVar = kbyVar22.a();
                    a2 = katVar.a(kbzVar.k);
                }
                if (a2 == null) {
                    return new kuq(new kmu(kbzVar), a2);
                }
                String aa = sb.length() > 0 ? a.aa(sb, " (", ")") : "";
                Object[] objArr = new Object[2];
                objArr[i] = str;
                objArr[c2] = aa;
                throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", objArr));
            } catch (IllegalArgumentException e7) {
                e = e7;
            }
            i3 = -1;
        } catch (IllegalArgumentException e8) {
            e = e8;
        }
    }

    private static List p(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(m((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(p((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Number) {
                arrayList.add(Double.valueOf(((Number) obj).doubleValue()));
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj.toString() + "' is of type '" + String.valueOf(obj.getClass()) + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
