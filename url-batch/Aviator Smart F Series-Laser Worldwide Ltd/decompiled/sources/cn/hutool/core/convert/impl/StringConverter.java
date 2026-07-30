package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import java.io.Closeable;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.TimeZone;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class StringConverter extends AbstractConverter<String> {
    private static final long serialVersionUID = 1;

    private static String blobToStr(Blob blob) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = blob.getBinaryStream();
                return cn.hutool.core.io.n.read(inputStream, cn.hutool.core.util.l.CHARSET_UTF_8);
            } catch (SQLException e8) {
                throw new ConvertException(e8);
            }
        } finally {
            cn.hutool.core.io.n.close((Closeable) inputStream);
        }
    }

    private static String clobToStr(Clob clob) {
        Reader reader = null;
        try {
            try {
                reader = clob.getCharacterStream();
                return cn.hutool.core.io.n.read(reader);
            } catch (SQLException e8) {
                throw new ConvertException(e8);
            }
        } finally {
            cn.hutool.core.io.n.close((Closeable) reader);
        }
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public String convertInternal(Object obj) {
        String typeName;
        if (obj instanceof TimeZone) {
            return ((TimeZone) obj).getID();
        }
        if (obj instanceof Node) {
            return cn.hutool.core.util.i1.toStr((Node) obj);
        }
        if (obj instanceof Clob) {
            return clobToStr((Clob) obj);
        }
        if (obj instanceof Blob) {
            return blobToStr((Blob) obj);
        }
        if (!(obj instanceof Type)) {
            return convertToStr(obj);
        }
        typeName = ((Type) obj).getTypeName();
        return typeName;
    }
}
