package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq3;
import com.google.android.gms.internal.ads.xp3;
import java.io.IOException;

/* loaded from: classes.dex */
public class xp3<MessageType extends aq3<MessageType, BuilderType>, BuilderType extends xp3<MessageType, BuilderType>> extends ao3<MessageType, BuilderType> {

    /* renamed from: f, reason: collision with root package name */
    private final MessageType f14303f;

    /* renamed from: g, reason: collision with root package name */
    protected MessageType f14304g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f14305h = false;

    protected xp3(MessageType messagetype) {
        this.f14303f = messagetype;
        this.f14304g = (MessageType) messagetype.E(4, null, null);
    }

    private static final void k(MessageType messagetype, MessageType messagetype2) {
        tr3.a().b(messagetype.getClass()).f(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.lr3
    public final /* synthetic */ kr3 a() {
        return this.f14303f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ao3
    protected final /* synthetic */ ao3 j(bo3 bo3Var) {
        m((aq3) bo3Var);
        return this;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f14303f.E(5, null, null);
        buildertype.m(b());
        return buildertype;
    }

    public final BuilderType m(MessageType messagetype) {
        if (this.f14305h) {
            q();
            this.f14305h = false;
        }
        k(this.f14304g, messagetype);
        return this;
    }

    public final BuilderType n(byte[] bArr, int i7, int i8, mp3 mp3Var) {
        if (this.f14305h) {
            q();
            this.f14305h = false;
        }
        try {
            tr3.a().b(this.f14304g.getClass()).h(this.f14304g, bArr, 0, i8, new eo3(mp3Var));
            return this;
        } catch (mq3 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw mq3.j();
        }
    }

    public final MessageType o() {
        MessageType b7 = b();
        if (b7.w()) {
            return b7;
        }
        throw new vs3(b7);
    }

    @Override // com.google.android.gms.internal.ads.jr3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public MessageType b() {
        if (this.f14305h) {
            return this.f14304g;
        }
        MessageType messagetype = this.f14304g;
        tr3.a().b(messagetype.getClass()).d(messagetype);
        this.f14305h = true;
        return this.f14304g;
    }

    protected void q() {
        MessageType messagetype = (MessageType) this.f14304g.E(4, null, null);
        k(messagetype, this.f14304g);
        this.f14304g = messagetype;
    }
}
