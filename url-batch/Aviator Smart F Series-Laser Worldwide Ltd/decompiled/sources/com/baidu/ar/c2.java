package com.baidu.ar;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c2 extends q2 {

    /* renamed from: h, reason: collision with root package name */
    public int f1884h;

    /* renamed from: i, reason: collision with root package name */
    public String f1885i;

    public c2() {
        super(t9.CLOSING);
        a("");
        a(1000);
    }

    public void a(int i8) {
        this.f1884h = i8;
        if (i8 == 1015) {
            this.f1884h = 1005;
            this.f1885i = "";
        }
        j();
    }

    @Override // com.baidu.ar.r4
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        if (this.f1884h != c2Var.f1884h) {
            return false;
        }
        String str = this.f1885i;
        String str2 = c2Var.f1885i;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.baidu.ar.r4, com.baidu.ar.q4
    public ByteBuffer f() {
        return this.f1884h == 1005 ? n1.a() : super.f();
    }

    @Override // com.baidu.ar.q2, com.baidu.ar.r4
    public void g() {
        super.g();
        if (this.f1884h == 1007 && this.f1885i.isEmpty()) {
            throw new t7(1007, "Received text is no valid utf8 string!");
        }
        if (this.f1884h == 1005 && this.f1885i.length() > 0) {
            throw new t7(1002, "A close frame must have a closecode if it has a reason");
        }
        int i8 = this.f1884h;
        if (i8 > 1015 && i8 < 3000) {
            throw new t7(1002, "Trying to send an illegal close code!");
        }
        if (i8 == 1006 || i8 == 1015 || i8 == 1005 || i8 > 4999 || i8 < 1000 || i8 == 1004) {
            throw new v7("closecode must not be sent over the wire: " + this.f1884h);
        }
    }

    public int h() {
        return this.f1884h;
    }

    @Override // com.baidu.ar.r4
    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.f1884h) * 31;
        String str = this.f1885i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String i() {
        return this.f1885i;
    }

    public final void j() {
        byte[] b8 = y1.b(this.f1885i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f1884h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(b8.length + 2);
        allocate2.put(allocate);
        allocate2.put(b8);
        allocate2.rewind();
        super.a(allocate2);
    }

    @Override // com.baidu.ar.r4
    public String toString() {
        return super.toString() + "code: " + this.f1884h;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f1885i = str;
        j();
    }

    @Override // com.baidu.ar.r4
    public void a(ByteBuffer byteBuffer) {
        int i8;
        this.f1884h = 1005;
        this.f1885i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            i8 = 1000;
        } else {
            if (byteBuffer.remaining() != 1) {
                if (byteBuffer.remaining() >= 2) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    allocate.position(2);
                    allocate.putShort(byteBuffer.getShort());
                    allocate.position(0);
                    this.f1884h = allocate.getInt();
                }
                byteBuffer.reset();
                try {
                    a(byteBuffer, byteBuffer.position());
                    return;
                } catch (t7 unused) {
                    this.f1884h = 1007;
                    this.f1885i = null;
                    return;
                }
            }
            i8 = 1002;
        }
        this.f1884h = i8;
    }

    public final void a(ByteBuffer byteBuffer, int i8) {
        try {
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.f1885i = y1.b(byteBuffer);
            } catch (IllegalArgumentException unused) {
                throw new t7(1007);
            }
        } finally {
            byteBuffer.position(i8);
        }
    }
}
