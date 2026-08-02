package org.apache.commons.imaging.formats.pnm;

import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes9.dex */
interface PnmWriter {
    void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map);
}
