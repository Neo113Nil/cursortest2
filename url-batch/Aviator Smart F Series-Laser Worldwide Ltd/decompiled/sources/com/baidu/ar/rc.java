package com.baidu.ar;

/* loaded from: classes.dex */
public class rc extends v2 {
    public rc() {
        super(t9.TEXT);
    }

    @Override // com.baidu.ar.v2, com.baidu.ar.r4
    public void g() {
        super.g();
        if (!y1.a(f())) {
            throw new t7(1007, "Received text is no valid utf8 string!");
        }
    }
}
