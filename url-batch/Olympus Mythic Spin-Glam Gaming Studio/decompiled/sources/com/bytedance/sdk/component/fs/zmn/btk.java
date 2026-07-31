package com.bytedance.sdk.component.fs.zmn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class btk extends mw {
    List<String> fs;
    List<String> zmn;

    btk(List<String> list, List<String> list2) {
        this.zmn = list;
        this.fs = list2;
    }

    public static final class zmn {
        private final List<String> zmn = new ArrayList();
        private final List<String> fs = new ArrayList();

        public zmn zmn(String str, String str2) {
            this.zmn.add(str);
            this.fs.add(str2);
            return this;
        }

        public btk zmn() {
            return new btk(this.zmn, this.fs);
        }
    }
}
