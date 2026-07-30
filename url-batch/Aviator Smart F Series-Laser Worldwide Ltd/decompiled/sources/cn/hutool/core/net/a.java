package cn.hutool.core.net;

import cn.hutool.core.codec.PercentCodec;

/* loaded from: classes.dex */
public class a {
    public static final PercentCodec ALL = PercentCodec.of(k.UNRESERVED).removeSafe('~').addSafe('*').setEncodeSpaceAsPlus(true);
}
