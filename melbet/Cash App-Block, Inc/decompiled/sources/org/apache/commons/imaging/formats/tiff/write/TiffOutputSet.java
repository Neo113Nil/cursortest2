package org.apache.commons.imaging.formats.tiff.write;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class TiffOutputSet {
    private static final String NEWLINE = System.getProperty("line.separator");
    public final ByteOrder byteOrder;
    private final List<TiffOutputDirectory> directories;

    public TiffOutputSet(ByteOrder byteOrder) {
        this.directories = new ArrayList();
        this.byteOrder = byteOrder;
    }

    public void addDirectory(TiffOutputDirectory tiffOutputDirectory) {
        if (findDirectory(tiffOutputDirectory.f1558type) == null) {
            this.directories.add(tiffOutputDirectory);
        } else {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Output set already contains a directory of that type.");
        }
    }

    public TiffOutputDirectory addExifDirectory() {
        TiffOutputDirectory tiffOutputDirectory = new TiffOutputDirectory(-2, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public TiffOutputDirectory addGPSDirectory() {
        TiffOutputDirectory tiffOutputDirectory = new TiffOutputDirectory(-3, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public TiffOutputDirectory addInteroperabilityDirectory() {
        getOrCreateExifDirectory();
        TiffOutputDirectory tiffOutputDirectory = new TiffOutputDirectory(-4, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public TiffOutputDirectory addRootDirectory() {
        TiffOutputDirectory tiffOutputDirectory = new TiffOutputDirectory(0, this.byteOrder);
        addDirectory(tiffOutputDirectory);
        return tiffOutputDirectory;
    }

    public void dump() {
        Debug.debug(toString());
    }

    public TiffOutputDirectory findDirectory(int i) {
        for (TiffOutputDirectory tiffOutputDirectory : this.directories) {
            if (tiffOutputDirectory.f1558type == i) {
                return tiffOutputDirectory;
            }
        }
        return null;
    }

    public TiffOutputField findField(int i) {
        Iterator<TiffOutputDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            TiffOutputField findField = it.next().findField(i);
            if (findField != null) {
                return findField;
            }
        }
        return null;
    }

    public List<TiffOutputDirectory> getDirectories() {
        return new ArrayList(this.directories);
    }

    public TiffOutputDirectory getExifDirectory() {
        return findDirectory(-2);
    }

    public TiffOutputDirectory getGPSDirectory() {
        return findDirectory(-3);
    }

    public TiffOutputDirectory getInteroperabilityDirectory() {
        return findDirectory(-4);
    }

    public TiffOutputDirectory getOrCreateExifDirectory() {
        getOrCreateRootDirectory();
        TiffOutputDirectory findDirectory = findDirectory(-2);
        return findDirectory != null ? findDirectory : addExifDirectory();
    }

    public TiffOutputDirectory getOrCreateGPSDirectory() {
        getOrCreateExifDirectory();
        TiffOutputDirectory findDirectory = findDirectory(-3);
        return findDirectory != null ? findDirectory : addGPSDirectory();
    }

    public TiffOutputDirectory getOrCreateRootDirectory() {
        TiffOutputDirectory findDirectory = findDirectory(0);
        return findDirectory != null ? findDirectory : addRootDirectory();
    }

    public List<TiffOutputItem> getOutputItems(TiffOutputSummary tiffOutputSummary) {
        ArrayList arrayList = new ArrayList();
        Iterator<TiffOutputDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getOutputItems(tiffOutputSummary));
        }
        return arrayList;
    }

    public TiffOutputDirectory getRootDirectory() {
        return findDirectory(0);
    }

    public void removeField(int i) {
        Iterator<TiffOutputDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            it.next().removeField(i);
        }
    }

    public void setGPSInDegrees(double d, double d2) {
        TiffOutputDirectory orCreateGPSDirectory = getOrCreateGPSDirectory();
        TagInfoBytes tagInfoBytes = GpsTagConstants.GPS_TAG_GPS_VERSION_ID;
        orCreateGPSDirectory.removeField(tagInfoBytes);
        orCreateGPSDirectory.add(tagInfoBytes, GpsTagConstants.gpsVersion());
        String str = d < 0.0d ? "W" : "E";
        double abs = Math.abs(d);
        String str2 = d2 < 0.0d ? "S" : "N";
        double abs2 = Math.abs(d2);
        TagInfoAscii tagInfoAscii = GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF;
        orCreateGPSDirectory.removeField(tagInfoAscii);
        orCreateGPSDirectory.add(tagInfoAscii, str);
        TagInfoAscii tagInfoAscii2 = GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF;
        orCreateGPSDirectory.removeField(tagInfoAscii2);
        orCreateGPSDirectory.add(tagInfoAscii2, str2);
        TagInfoRationals tagInfoRationals = GpsTagConstants.GPS_TAG_GPS_LONGITUDE;
        orCreateGPSDirectory.removeField(tagInfoRationals);
        orCreateGPSDirectory.add(tagInfoRationals, RationalNumber.valueOf((long) abs), RationalNumber.valueOf((long) r10), RationalNumber.valueOf((((abs % 1.0d) * 60.0d) % 1.0d) * 60.0d));
        TagInfoRationals tagInfoRationals2 = GpsTagConstants.GPS_TAG_GPS_LATITUDE;
        orCreateGPSDirectory.removeField(tagInfoRationals2);
        orCreateGPSDirectory.add(tagInfoRationals2, RationalNumber.valueOf((long) abs2), RationalNumber.valueOf((long) r12), RationalNumber.valueOf((((abs2 % 1.0d) * 60.0d) % 1.0d) * 60.0d));
    }

    public String toString(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append(str);
        sb.append("TiffOutputSet {");
        String str2 = NEWLINE;
        sb.append(str2);
        sb.append(str);
        sb.append("byteOrder: ");
        sb.append(this.byteOrder);
        sb.append(str2);
        for (int i = 0; i < this.directories.size(); i++) {
            TiffOutputDirectory tiffOutputDirectory = this.directories.get(i);
            sb.append(String.format("%s\tdirectory %d: %s (%d)%n", str, Integer.valueOf(i), tiffOutputDirectory.description(), Integer.valueOf(tiffOutputDirectory.f1558type)));
            for (TiffOutputField tiffOutputField : tiffOutputDirectory.getFields()) {
                Boxes$$ExternalSyntheticOutline1.m(sb, str, "\t\tfield ", i, ": ");
                sb.append(tiffOutputField.tagInfo);
                sb.append(NEWLINE);
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(NEWLINE);
        return sb.toString();
    }

    public TiffOutputSet() {
        this(TiffConstants.DEFAULT_TIFF_BYTE_ORDER);
    }

    public void removeField(TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    public TiffOutputField findField(TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public String toString() {
        return toString(null);
    }
}
