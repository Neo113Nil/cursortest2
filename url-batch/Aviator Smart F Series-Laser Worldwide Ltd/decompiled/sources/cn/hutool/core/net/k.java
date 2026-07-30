package cn.hutool.core.net;

import cn.hutool.core.codec.PercentCodec;

/* loaded from: classes.dex */
public class k {
    public static final PercentCodec FRAGMENT;
    public static final PercentCodec GEN_DELIMS;
    public static final PercentCodec PATH;
    public static final PercentCodec PCHAR;
    public static final PercentCodec QUERY;
    public static final PercentCodec QUERY_PARAM_NAME;
    public static final PercentCodec QUERY_PARAM_NAME_STRICT;
    public static final PercentCodec QUERY_PARAM_VALUE;
    public static final PercentCodec QUERY_PARAM_VALUE_STRICT;
    public static final PercentCodec RESERVED;
    public static final PercentCodec SEGMENT;
    public static final PercentCodec SEGMENT_NZ_NC;
    public static final PercentCodec SUB_DELIMS;
    public static final PercentCodec UNRESERVED;

    static {
        PercentCodec of = PercentCodec.of(":/?#[]@");
        GEN_DELIMS = of;
        PercentCodec of2 = PercentCodec.of("!$&'()*+,;=");
        SUB_DELIMS = of2;
        RESERVED = of.orNew(of2);
        PercentCodec of3 = PercentCodec.of(unreservedChars());
        UNRESERVED = of3;
        PercentCodec or = of3.orNew(of2).or(PercentCodec.of(":@"));
        PCHAR = or;
        SEGMENT = or;
        SEGMENT_NZ_NC = PercentCodec.of(or).removeSafe(':');
        PATH = or.orNew(PercentCodec.of("/"));
        PercentCodec orNew = or.orNew(PercentCodec.of("/?"));
        QUERY = orNew;
        FRAGMENT = orNew;
        PercentCodec removeSafe = PercentCodec.of(orNew).removeSafe('&');
        QUERY_PARAM_VALUE = removeSafe;
        QUERY_PARAM_VALUE_STRICT = of3;
        QUERY_PARAM_NAME = PercentCodec.of(removeSafe).removeSafe('=');
        QUERY_PARAM_NAME_STRICT = of3;
    }

    private static StringBuilder unreservedChars() {
        StringBuilder sb = new StringBuilder();
        for (char c8 = 'A'; c8 <= 'Z'; c8 = (char) (c8 + 1)) {
            sb.append(c8);
        }
        for (char c9 = 'a'; c9 <= 'z'; c9 = (char) (c9 + 1)) {
            sb.append(c9);
        }
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            sb.append(c10);
        }
        sb.append("_.-~");
        return sb;
    }
}
