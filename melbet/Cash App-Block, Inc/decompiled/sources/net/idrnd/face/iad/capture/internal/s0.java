package net.idrnd.face.iad.capture.internal;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes9.dex */
public final class s0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a$2(List list) {
        copyOnWrite();
        ((t0) this.instance).a(list);
    }

    public final void a$5() {
        String str = Build.BOARD;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.board_ = Build.BOARD;
    }

    public final void a$6() {
        long j = Build.TIME;
        copyOnWrite();
        ((t0) this.instance).time_ = Build.TIME;
    }

    public final void b(List list) {
        copyOnWrite();
        ((t0) this.instance).b$1(list);
    }

    public final void b$3() {
        String str = Build.BOOTLOADER;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.bootloader_ = Build.BOOTLOADER;
    }

    public final void c(List list) {
        copyOnWrite();
        ((t0) this.instance).c$1(list);
    }

    public final void c$1() {
        String str = Build.BRAND;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.brand_ = Build.BRAND;
    }

    public final void d() {
        String str = Build.DEVICE;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.device_ = Build.DEVICE;
    }

    public final void e() {
        String str = Build.DISPLAY;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.display_ = Build.DISPLAY;
    }

    public final void f() {
        String str = Build.FINGERPRINT;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.fingerprint_ = Build.FINGERPRINT;
    }

    public final void g() {
        String str = Build.HARDWARE;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.hardware_ = Build.HARDWARE;
    }

    public final void h() {
        String str = Build.HOST;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.host_ = Build.HOST;
    }

    public final void i() {
        String str = Build.ID;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.id_ = Build.ID;
    }

    public final void j() {
        String str = Build.MANUFACTURER;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.manufacturer_ = Build.MANUFACTURER;
    }

    public final void k() {
        String str = Build.MODEL;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.model_ = Build.MODEL;
    }

    public final void l(String str) {
        int i;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        i = t0Var.bitField0_;
        t0Var.bitField0_ = i | 1;
        t0Var.odmSku_ = str;
    }

    public final void m() {
        String str = Build.PRODUCT;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.product_ = Build.PRODUCT;
    }

    public final void n(String str) {
        int i;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        i = t0Var.bitField0_;
        t0Var.bitField0_ = i | 2;
        t0Var.sku_ = str;
    }

    public final void o(String str) {
        int i;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        i = t0Var.bitField0_;
        t0Var.bitField0_ = i | 4;
        t0Var.socManufacturer_ = str;
    }

    public final void p(String str) {
        int i;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        i = t0Var.bitField0_;
        t0Var.bitField0_ = i | 8;
        t0Var.socModel_ = str;
    }

    public final void q() {
        String str = Build.TAGS;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.tags_ = Build.TAGS;
    }

    public final void r() {
        String str = Build.TYPE;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.type_ = Build.TYPE;
    }

    public final void s() {
        String str = Build.USER;
        copyOnWrite();
        t0 t0Var = (t0) this.instance;
        t0Var.getClass();
        str.getClass();
        t0Var.user_ = Build.USER;
    }
}
