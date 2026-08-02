package org.apache.commons.imaging;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.image.BufferedImage;
import java.util.logging.Logger;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.icc.IccProfileParser;

/* loaded from: classes9.dex */
public class ImageDump {
    private static final Logger LOGGER = Logger.getLogger(ImageDump.class.getName());

    private String colorSpaceTypeToName(ColorSpace colorSpace) {
        int type2 = colorSpace.getType();
        if (type2 == 5) {
            return "TYPE_RGB";
        }
        if (type2 == 9) {
            return "TYPE_CMYK";
        }
        switch (type2) {
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO /* 1000 */:
                return "CS_sRGB";
            case IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO /* 1001 */:
                return "CS_CIEXYZ";
            case IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA /* 1002 */:
                return "CS_PYCC";
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE /* 1003 */:
                return "CS_GRAY";
            case 1004:
                return "CS_LINEAR_RGB";
            default:
                return "unknown";
        }
    }

    public void dump(String str, BufferedImage bufferedImage) {
        LOGGER.fine(str + ": dump");
        dumpColorSpace(str, bufferedImage.getColorModel().getColorSpace());
        dumpBIProps(str, bufferedImage);
    }

    public void dumpBIProps(String str, BufferedImage bufferedImage) {
        String[] propertyNames = bufferedImage.getPropertyNames();
        if (propertyNames == null) {
            LOGGER.fine(str + ": no props");
            return;
        }
        for (String str2 : propertyNames) {
            LOGGER.fine(str + ": " + str2 + ": " + bufferedImage.getProperty(str2));
        }
    }

    public void dumpColorSpace(String str, ColorSpace colorSpace) {
        Logger logger = LOGGER;
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": type: ");
        m108m.append(colorSpace.getType());
        m108m.append(" (");
        m108m.append(colorSpaceTypeToName(colorSpace));
        m108m.append(")");
        logger.fine(m108m.toString());
        if (colorSpace instanceof ICC_ColorSpace) {
            new IccProfileParser().getICCProfileInfo(((ICC_ColorSpace) colorSpace).getProfile().getData()).dump(str);
        } else {
            StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str, ": Unknown ColorSpace: ");
            m108m2.append(colorSpace.getClass().getName());
            logger.fine(m108m2.toString());
        }
    }

    public void dump(BufferedImage bufferedImage) {
        dump("", bufferedImage);
    }
}
